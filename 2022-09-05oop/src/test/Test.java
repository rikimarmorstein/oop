package test;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		double natural = sc.nextDouble();
		if (natural <= 0 || natural - (int) natural != 0) {
			System.out.println("You did not insert a natural number, insert a number again: ");
			natural = sc.nextDouble();

		}

		System.out.println("The reverse of the number: " + getReverseNatural((int) natural));
		System.out.println("The number of digits in a number: " + getNumberOfDigits((int) natural));
		naturalToArray((int) natural);
		System.out.println("Is the number a palindrome?: " + isPalindarom((int) natural));

		while (natural != getPalindrome((int) natural)) {

			natural = natural + getPalindrome((int) natural);

			System.out.println("No palindrome, connect the number with the opposite number "+(int) natural);

		}

		System.out.println("palindrome " + getPalindrome((int) natural));
		sc.close();

	}

	public static int getReverseNatural(int number) {
		int a = 0;
		while (number > 0) {
			a = a * 10;
			a = a + (number % 10);
			number = number / 10;
		}
		return a;
	}

	public static int getNumberOfDigits(int num) {
		int i = 0;
		while (num > 0) {
			i++;
			num = num / 10;

		}
		return i;
	}

	public static void naturalToArray(int num) {
		int a = 0;
		int j = 0;
		while (num > 0) {
			j++;
			a = a * 10;
			a = (int) (a + (num % 10));
			num = num / 10;
		}
		int[] arr = new int[j];
		for (int i = 0; a > 0; i++) {
			arr[i] = a % 10;
			a = a / 10;
		}
		System.out.println("Print the number as an array " + Arrays.toString(arr));

	}

	public static boolean isPalindarom(int num) {
		int a = 0;
		int g=num;
		while (num > 0) {
			a = a * 10;
			a = a + (num % 10);
			num = num / 10;
		}
		if (g == a) {
			return true;
		} 
			return false;
		
	}

	public static int getPalindrome(int num) {
		int m = 0;

		while (num > 0) {
			m = m * 10;
			m = (int) (m + (num % 10));
			num = num / 10;
		}
		return m;
	}
}

package e.homework;

import java.util.Arrays;

public class Lab8tar8 {

	public static void main(String[] args) {


		int[]arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*101);
			
		}System.out.println(Arrays.toString(arr));
		
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}System.out.println(sum);
		System.out.println(sum/arr.length);
		
		int b=0;
		int l=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>b) {
				b=arr[i];
				l = i;
			}
		}System.out.println(b);
		System.out.println(l);
		
		int h=100;
		int k=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<h) {
				h=arr[i];
				k=i;
			}
		}System.out.println(h);
		System.out.println(k);
	}

}

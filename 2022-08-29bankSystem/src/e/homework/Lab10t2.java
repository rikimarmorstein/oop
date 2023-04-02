package e.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Lab10t2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int []sca = new int[10];
		for (int i = 0; i < sca.length; i++) {	
			System.out.println("enter number: ");
			sca[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(sca));
		int b=0;
		for (int i = 0; i < sca.length/2; i++) {
			b=sca[i];
			sca[i] = sca[sca.length-1-i];
			sca[sca.length-1-i]=b;
		}
		System.out.println(Arrays.toString(sca));
		
		int []ezer = new int[10];
		for (int i = 0; i < ezer.length; i++) {
			ezer[sca[i]]=sca[i];		
			
		}System.out.println(Arrays.toString(ezer));
		
	}

}

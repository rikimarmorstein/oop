package e.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Lab10t {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int []sca = new int[10];
		for (int i = 0; i < sca.length; i++) {	
			System.out.println("enter number: ");
			sca[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(sca));
		
		for (int i = 0; i < sca.length; i++) {
			for (int j = 1+i; j < sca.length; j++) {
				if (sca[i]==sca[j]) {
					sca[j]=-1;
				}
				
			}
		}for (int i = 0; i < sca.length; i++) {
			if (sca[i]>0) {
				System.out.print(sca[i] + ", ");
			}
		}
		
		
	}

}

package e.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Lab10 {

	public static void main(String[] args) {


		int [] arr = {1,2,3,1,2,3,3,2,1,9,5,1,1,9};
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 1) {
				c++;
			}
		}System.out.println(c);
		
		int length = 0;
		int[]temp = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			int can = arr[i];
					boolean found = true;
					for (int j = 0; j < length; j++) {
			if (can == temp[j]) {
			found=false;	
			break;
			}
				
			}
			if (found=true) {
				temp[length++]= can;
			}
		} arr = new int[length];
		System.arraycopy(temp, 0, arr, 0, length);
		System.out.println(Arrays.toString(arr));

		
		
	}

}

package e.homework;

import java.util.Arrays;

public class Lab6 {

	public static void main(String[] args) {

int [] arr = new int [40];


for (int i = 2; i < arr.length; i++) {
	arr[0] = 1;
	arr[1] = 1;
	arr[i] = arr[i-1] + arr[i-2];
}System.out.println(Arrays.toString(arr));

int a = (int)(Math.random()*40)+1;
System.out.println(a);
int k=0;
for (int i = 0; i < arr.length; i++) {
	if (i==a) {
		k=arr[i];
	}
}System.out.println(k);

int c = (int)(Math.random()*41)+10;
System.out.println(c);
int []arr1 = new int[c];
for (int i = 2; i < c; i++) {
	arr1[0]=1;
	arr1[1]=1;
	arr1[i]=arr1[i-1]+arr1[i-2];
}System.out.println(Arrays.toString(arr1));

	}

}

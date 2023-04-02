package d.test;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {


		int [] nums1 = new int[10];
		int [] nums2 = new int[10];

		for (int i = 0; i < nums1.length; i++) {
			nums1[i] = (int)(Math.random()*10);
			
		}System.out.println(Arrays.toString(nums1));
	
		for (int i = 0; i < nums2.length; i++) {
			nums2[i] =(int)(Math.random()*10); 
		}System.out.println(Arrays.toString(nums2));
	
		
		int high = 0;
		
		for (int i = 1; i <=9; i++) {
			int b=0;
			for (int j = 0; j < nums1.length; j++) {
			if ( i == nums1[j]) {
				b=b*10;
				b=b+i;
			}
			}
			if (b>high) {
				high = b;
			}
		}			System.out.println(high);

		
		int []max = new int[5];
		int y=0;
		for (int i = 9; i >=0 && y<=4; i--) {
			for (int j = 0; j < nums1.length; j++) {
				if (nums1[j]==i || nums2[j]==i) {
					max[y++] = i;
					break;
				}

			}
		}System.out.println(Arrays.toString(max));
	
	int maxx = max[0]*100 + max[0]*10;
	int c=0;
	for (int j = 9; j >=0 ; j--) {
			for (int i = 0; i < nums1.length; i++) {
if (nums1[i]==j|| nums2[i]==j) {
	c=c+1;
}}
	} if (c>2) {
		int g = maxx+max[0];
	}int g = maxx + max[1];
		System.out.println(g);
	
		int []zugi = new int [10];
		int h=0;
		boolean found = false;
		for (int i = 0; i < nums1.length; i+=2) {
			for (int j = 0; j < nums1.length; j++) {
				if (nums1[j] ==i) {
				zugi[h++] = i;
				found=true;
				break;
				}
			}
		}System.out.println(Arrays.toString(zugi));
	
		if (found=false){
			System.out.println("not zugi");
			
			}
		
		int d=0;
		boolean found1 = false;
		for (int i = 0; i <=10; i+=2) {
			for (int j = 0; j < nums1.length; j++) {
				if (nums1[j] ==i) {
				d=d*10;
				d=d+i;
				found=true;
				break;
				}
			}
		}System.out.println(d);
		
		if (found1) {
			System.out.println("not");
		}
	}
}

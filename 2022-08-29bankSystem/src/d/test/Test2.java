package d.test;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {

		int [] nums1 = new int[10];
		int [] nums2 = new int[10];

		for (int i = 0; i < nums1.length; i++) {
			nums1[i] = (int)(Math.random()*10);
			
		}System.out.println(Arrays.toString(nums1));
	
		for (int i = 0; i < nums2.length; i++) {
			nums2[i] =(int)(Math.random()*10); 
		}System.out.println(Arrays.toString(nums2));
	
		int []ezer = new int [10];
		for (int i = 0; i < nums1.length; i++) {
			if (ezer[nums1[i]]!=0) {
				ezer[nums1[i]]=ezer[nums1[i]]*10;
				ezer[nums1[i]] = ezer[nums1[i]] + nums1[i];
				}else {
					ezer[nums1[i]]=nums1[i];
				}
		} System.out.println(Arrays.toString(ezer));
				int high = 0;

		for (int i = 0; i < ezer.length; i++) {
				if(ezer[i]>high) {
			high = ezer[i];
		}
		}System.out.println(high);
	
		int [] max1 = new int[5];
		int max = 9;
		for (int j = 0; j < max1.length; j++) {
			for (int i = 0; i < nums1.length; i++) {
			if (nums1[i] == max || nums2[i] ==max) {
				max1[j] = max;
			}
			
		}max--;
		
		}System.out.println("answar 5 :" + Arrays.toString(max1));
		
	}

}

package b;

import java.util.Arrays;

public class TestOrange {

	public static void main(String[] args) {

		Orange[] oranges = new Orange[100];
		


		for (int i = 0; i < oranges.length; i++) {	
			int size = (int) (Math.random() * 3) + 3;
			Orange o = new Orange(size);
			oranges[i] = o;
			
			// System.out.println(oranges[i]);
		}
		System.out.println(Arrays.toString(oranges));

		Orange[] bigOranges = new Orange[100];
		Orange[] mediumOranges = new Orange[100];
		Orange[] smallOranges = new Orange[100];
		
		
		for (int i = 0, s=0, m=0,b=0; i < oranges.length; i++) {	
			Orange o = oranges[i];
			if (o.getSize()==3) {
				smallOranges[s++] = o;
			}else if (o.getSize()==4) {
				mediumOranges[m++] = o;
			}else {
				bigOranges[b++] =o; 
			}			
			

		}	
		System.out.println(Arrays.toString(smallOranges));
		System.out.println(Arrays.toString(mediumOranges));
		System.out.println(Arrays.toString(bigOranges));

	}}


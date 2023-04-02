package f;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {


		FruitFactory fruit1 = new FruitFactory();
		
		for (int i = 0; i < 25; i++) {
			int size = (int)(Math.random()*3)+3;
			int pree = (int)(Math.random()*3);
			if(pree ==0) {
				fruit1.add(new Orange(size));
			}else if (pree==1) {
				fruit1.add(new Apple(size));
			}else {
				fruit1.add(new Peach(size));

			}
		}
		System.out.println("small apples: " + Arrays.toString(fruit1.getSmallApples()) );
			System.out.println("big apples: " + Arrays.toString(fruit1.getBigApples()) );
			System.out.println("medium apples: " + Arrays.toString(fruit1.getMediumApples()) );

			System.out.println("small oranges: " + Arrays.toString(fruit1.getSmallOranges()) );
			System.out.println("big oranges: " + Arrays.toString(fruit1.getBigOranges()) );
			System.out.println("medium oranges: " + Arrays.toString(fruit1.getMediumOranges()) );

			System.out.println("small peachies: " + Arrays.toString(fruit1.getMediumPeachies()) );
			System.out.println("big peachies: " + Arrays.toString(fruit1.getBigPeachies()) );
			System.out.println("medium peachies: " + Arrays.toString(fruit1.getMediumPeachies()) );
	}
}

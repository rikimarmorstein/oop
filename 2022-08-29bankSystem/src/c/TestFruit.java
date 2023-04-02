package c;

import java.util.Arrays;

public class TestFruit {

	public static void main(String[] args) {

		FruitFactory factory = new FruitFactory();
		
		factory.add(new Apple(5));
		factory.add(new Apple(4));
		factory.add(new Apple(3));
		factory.add(new Apple(5));
		factory.add(new Orange(5));
		factory.add(new Orange(3));
		factory.add(new Orange(5));
		factory.add(new Orange(5));

		
			System.out.println("small apples: " + Arrays.toString(factory.getSmallApples()) );
			System.out.println("big apples: " + Arrays.toString(factory.getBigApples()) );
			System.out.println("medium apples: " + Arrays.toString(factory.getMediumApples()) );

			System.out.println("small oranges: " + Arrays.toString(factory.getSmallOranges()) );
			System.out.println("big oranges: " + Arrays.toString(factory.getBigOranges()) );
			System.out.println("medium oranges: " + Arrays.toString(factory.getMediumOranges()) );

			System.out.println("small peachies: " + Arrays.toString(factory.getMediumPeachies()) );
			System.out.println("big peachies: " + Arrays.toString(factory.getBigPeachies()) );
			System.out.println("medium peachies: " + Arrays.toString(factory.getMediumPeachies()) );

		}
		
	

}

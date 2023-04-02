package animals;

import java.util.Arrays;

import Abstract.Rectangle;

public class Test4 {

	public static void main(String[] args) {
		Zoo z = new Zoo();

		Animal animal = new Dog();

		z.addAnimal(animal);
		z.addAnimal(new Ostrich());
		z.addAnimal(new Hawk());
		z.addAnimal(new Bat());
		z.addAnimal(new Butterfly());
		z.addAnimal(new Ant());
		z.addAnimal(new Ant());
		z.addAnimal(new Dog());
		z.addAnimal(new Ostrich());
		z.addAnimal(new Hawk());
		z.addAnimal(new Bat());
		z.addAnimal(new Butterfly());
		z.addAnimal(new Cat());

		System.out.println("all flyers: "+Arrays.toString(z.getFlyers()));
		
		System.out.println("birds that can't flyer: " +Arrays.toString(z.getBirds()));

		System.out.println("insects that can't flyer: " +Arrays.toString(z.getInsects()));
		System.out.println("mammals that can't flyer: " +Arrays.toString(z.getMammals()));

		System.out.println("===========================");
		System.out.println("all insects: " + Arrays.toString(z.getInsect()));
		System.out.println("=========================");
		System.out.println("=========================");
		System.out.println("all birds: " +Arrays.toString(z.getBird()));

				System.out.println("all mammals: " +Arrays.toString(z.getMammal()));


	}

}

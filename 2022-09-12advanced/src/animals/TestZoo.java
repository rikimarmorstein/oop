package animals;

public class TestZoo {

	public static void main(String[] args) {


		Flyer[] flyer = new Flyer[10];
		Mammals[] mammals = new Mammals[20];
		Insect[] insect = new Insect[10];
		Bird[] bird = new Bird[10];
		
		Animal[] animals = new Animal[10];

		for (int i = 0; i < animals.length; i++) {
			int a = (int) (Math.random() * 6) + 1;
			if (a == 1) {
				animals[i] = new Dog();
			} else if (a == 2) {
				animals[i] = new Bat();
			} else if (a == 3) {
				animals[i] = new Ostrich();
			} else if (a == 4) {
				animals[i] = new Hawk();
			} else if (a == 5) {
				animals[i] = new Ant();
			} else {
				animals[i] = new Butterfly();
			}Animal animal=animals[i];

	}
	}
}

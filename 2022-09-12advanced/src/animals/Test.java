package animals;

public class Test {

	public static void main(String[] args) {

		Animal[] animals = new Animal[10];
		animals[0] = new Dog();
		animals[1] = new Ostrich();
		animals[2] = new Hawk();
		animals[3] = new Bat();
		animals[4] = new Dog();
		animals[5] = new Butterfly();
		animals[6] = new Dog();
		animals[7] = new Ant();
		animals[8] = new Bat();
		animals[9] = new Dog();

		for (int i = 0; i < animals.length; i++) {
			Animal animal = animals[i];
			System.out.print(animal.getClass().getSimpleName() + ": ");
			animal.speak();
			if(animal instanceof AdvancedFlyer) {
				AdvancedFlyer advancedFlyer	= (AdvancedFlyer) animal;
				advancedFlyer.fly();
				advancedFlyer.navigate();
				advancedFlyer.land();
				advancedFlyer.takeOff();
				
			}else {
			if (animal instanceof Flyer) {
				Flyer flyer = (Flyer) animal;
				flyer.fly();
				if (animal instanceof Navigator) {
					Navigator navigate = (Navigator) animal;
					navigate.navigate();
				}

			}
			System.out.println("===================");
		}

	
		}
}
}
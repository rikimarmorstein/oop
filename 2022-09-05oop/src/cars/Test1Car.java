package cars;

public class Test1Car {

	public static void main(String[] args) {


		Car car = new Car();
		car.setNumber(4040);
		car.setSpeed(40);
		
		System.out.println(car.getNumber());
		System.out.println(car.getSpeed());
		System.out.println(car);
	}

}

package cars;

import java.util.Arrays;

public class Highway {

	private String name;
	private Car[]cars = new Car[10];
	private int i;
	
	public Highway(String name) {
		super();
		this.name = name;
	}
	
	public void addCar(Car car) {
		cars[i++] = car;
	}

	public Car[] getCars() {
		return cars;
	}

	@Override
	public String toString() {
		return "Highway [cars=" + Arrays.toString(cars) + "]";
	}
	
	
	
}

package Enum;

public class Car {
	
	public enum Make{
		HONDA;
	}

	public enum Color{
		RED,GREEN;
	}
	private Color color;
	private Make make;
	
	
	public Car(Color color, Make make) {
		super();
		this.color = color;
		this.make = make;
	}


	@Override
	public String toString() {
		return "Car [color=" + color + ", make=" + make + "]";
	}
	
	
}

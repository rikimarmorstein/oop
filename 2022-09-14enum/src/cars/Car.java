package cars;

import java.util.Objects;

public class Car {

	private String color;
	private int speed;
	private int number;
	
	public Car() {
		
	}

	public Car(String color, int speed,int number) {
		super();
		this.color = color;
		setSpeed(speed);
		this.number= number;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Car)) {
			return false;
		}
		Car other = (Car) obj;
		return number == other.number;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int val) {
		if (speed+val <=200) {
		speed=speed+val;
	}else {
		speed=200;
	}
	
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", number=" + number + "]";
	}

	
	
}

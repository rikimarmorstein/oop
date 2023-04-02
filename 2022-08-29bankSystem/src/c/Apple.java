package c;

public class Apple extends Fruit {

	public Apple(int size) {
		super(size);

	}

	@Override
	public String toString() {
		return "Apple =" + getSize() + "]";
	}

	
	
}

package b;

public class Orange {

	private int size=3;

	public Orange(int size) {
		setSize(size);
	}

	
	
	@Override
	public String toString() {
		return "Orange [size=" + size + "]";
	}



	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if (size >=3 && size <=5)
		this.size = size;
	}
	
	
	
	
}

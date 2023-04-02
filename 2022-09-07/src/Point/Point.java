package Point;

public class Point {
	
	private static int c;

	public static final int MAX =100;
	public static final int MIN =0;
	public final int index= ++c;

	private int x;
	private int y;
	private String name;
	
	public static int getNumberOfPoints() {
		return c;
	}

	public Point() {
		
	}
	
	public Point( String name, int x,int y) {
		super();
		setX(x);
		setY(y);
		this.name = name;
	}



	public int getX() {
		return x;
	}

	public void setX(int x) {
		if (x<=MAX && x>=MIN)
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if (y<=MAX && y>=MIN)
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [index=" + index + ", name: " + name + ", x=" + x + ", y=" + y + "]";	}
	

}

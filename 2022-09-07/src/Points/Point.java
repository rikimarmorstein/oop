package Points;

public class Point {

	private static int c;

	public final int index = ++c;
	
	private static int MAX = 100;
	private static int MIN = 0;

	private int x;
	private int y;
	private String name;

	
	public Point(String name, int x, int y) {
		this.name = name;
		this.x=x;
		this.y=y;
}

	public static int getC() {
		return c;
	}

	@Override
	public String toString() {
		return "Point [index=" + index + ", x=" + x + ", y=" + y +", name="+ name+ "]";
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
}

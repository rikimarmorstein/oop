package Abstract;

public class Test {

	public static void main(String[] args) {
Shape shape=new Rectangle("red", 4, 20);
System.out.println(shape.getColor());
System.out.println(shape.getArea());

((Rectangle) shape).setWidth(30);

Rectangle rectangle = (Rectangle) shape;
rectangle.setWidth(25);

Shape[]shapes = new Shape[3];

	}

	public static void printAnyShpe(Shape shape) {
		System.out.println("area is: "+ shape.getArea());
	}
}

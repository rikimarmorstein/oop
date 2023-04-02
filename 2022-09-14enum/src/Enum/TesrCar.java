package Enum;

import java.util.Arrays;
import java.util.Scanner;


public class TesrCar {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.println("choose color");
Car.Color[]colors = Car.Color.values();

System.out.println(Arrays.toString(colors));

String input = sc.nextLine();
Car.Color color = Car.Color.valueOf(input.toUpperCase());
System.out.println("choose make");
Car.Make[]makes = Car.Make.values();
System.out.println(Arrays.toString(makes));
Car.Make make = Car.Make.valueOf(sc.nextLine().toUpperCase());


Car car = new Car(color, make);
System.out.println(car);
sc.close();
	}

}

package cars;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

State state = new State("Israel");

state.addHighway(new Highway("6"));
state.addHighway(new Highway("5"));
state.addHighway(new Highway("4"));

state.getHighways()[0].addCar(new Car("red", 200, 111));
state.getHighways()[0].addCar(new Car("red", 150, 222));
state.getHighways()[1].addCar(new Car("red", 200, 333));
state.getHighways()[2].addCar(new Car("red", 100, 444));
state.getHighways()[2].addCar(new Car("red", 180, 555));
state.getHighways()[0].addCar(new Car("red", 180, 555));


System.out.println(Arrays.toString(state.getHighways()));
System.out.println(state.getHighways()[0]);
System.out.println(state.getNumOfCars(0));
System.out.println(state.speed());

	}

}

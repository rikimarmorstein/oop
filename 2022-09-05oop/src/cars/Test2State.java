package cars;

public class Test2State {

	public static void main(String[] args) {

State state=new State("Israel");

Highway highway = new Highway("6");
state.addHighway(highway);
//state.addHighway(new Highway("6"));
state.addHighway(new Highway("1"));
state.addHighway(new Highway("GEAH"));
	
state.getHighways()[0].addCar(new Car(111,30));
state.getHighways()[0].addCar(new Car(222,40));
state.getHighways()[0].addCar(new Car(333,40));

state.getHighways()[1].addCar(new Car(444,40));
state.getHighways()[1].addCar(new Car(555,30));

state.getHighways()[2].addCar(new Car(666,10));
state.getHighways()[2].addCar(new Car(777,40));
state.getHighways()[2].addCar(new Car(888,30));


System.out.println("6:" + state.getNumberOfCars(0));
System.out.println(state.getSpeedWay());
System.out.println(state.getSlowWay());

	}

}

package cars;

public class State {

	private String name;
	private Highway[] highways = new Highway[10];
	private int i;

	public State(String name) {
		super();
		this.name = name;

	}

	public void addHighway(Highway highway) {
		highways[i++] = highway;
	}

	public Highway[] getHighways() {
		return highways;
	}

	public int getNumOfCars(int indexHighway) {
		Highway highway = highways[indexHighway];
		Car[] carsofhighway = highway.getCars();
		int counter = 0;
		for (int i = 0; i < carsofhighway.length; i++) {
			if (carsofhighway[i] != null) {
				counter++;
			}
		}
		return counter;
	}

	public int speed() {
		int sumn = 0;
		int mahir = 0;
		for (int i = 0; i < highways.length; i++) {
			int sum = 0;
			int mmuza = 0;
			Highway highway = highways[i];
			if (highway != null) {
				Car[] highwayCars = highway.getCars();
				for (int j = 0; j < highwayCars.length; j++) {
					Car car = highwayCars[j];
					if (car != null) {
						sum = sum + highwayCars[j].getSpeed();
						mmuza = sum / (j + 1);
					}
				}
				if (mmuza > sumn) {
					sumn = mmuza;
					mahir = i;

				}
			}

		}
		return mahir;

	}
}
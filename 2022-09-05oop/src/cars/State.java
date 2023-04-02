package cars;

public class State {

	private String name;
	private Highway[] highways = new Highway[5];
	private int i;

	public State(String name) {
		super();
		this.name = name;
	}

	public void addHighway(Highway highway) {
		highways[i++] = highway;
	}

	public String getName() {
		return name;
	}

	public Highway[] getHighways() {
		return highways;
	}

	public int getNumberOfCars(int highwayIndex) {
		Highway highway = highways[highwayIndex];
		Car[] highwayCars = highway.getCars();
		int counter = 0;
		for (int i = 0; i < highwayCars.length; i++) {
			Car car = highwayCars[i];
			if (car != null) {
				counter++;
			}
		}
		return counter;
	}

	public int getSpeedWay() {
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

	public int getSlowWay() {
		int slow = 0;
		int sumn = 200;
		for (int i = 0; i < highways.length; i++) {
			int sum = 0;
			int memuza = 0;
			Highway highway = highways[i];
			if (highway != null) {
				Car[] highwaycars = highway.getCars();
				for (int j = 0; j < highwaycars.length; j++) {
					Car car = highwaycars[j];
					if (car != null) {
						sum = sum + car.getSpeed();
						memuza = sum / (j + 1);
					}

				}
				if (memuza < sumn) {
					sumn = memuza;
					slow = i;
				}
			}
		}
		return slow;
	}

	
}

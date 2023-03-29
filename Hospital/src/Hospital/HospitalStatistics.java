package Hospital;


public class HospitalStatistics {
	//5
//1
	public static int sumNumOfPeople(Hospital hospital) {
		int sum = 0;
		for (Room room : hospital.getRooms()) {
			if (room.getDoctor() != null)
				sum++;
			if (room.getNurse() != null)
				sum++;
			for (Patient p : room.getPatients()) {
				sum++;
			}
		}
		return sum;

	}
//2
	public static int memuzeTimeToCure(Hospital hospital) {
		int sum = 0;
		int people = 0;
		int summ = 0;
		for (Room room : hospital.getRooms()) {
			if (room != null)
				for (Patient p : room.getPatients()) {
					if (p != null)
						people++;
					sum = sum + Disease.getTimeToCure();
					summ = sum / people;
				}
		}
		return summ;
	}
//3.1
	public static void memuzeTime(Hospital hospital, DiseaseDescription diseaseDescription) {
		int sumT = 0;
		int peopleT = 0;
		int summT = 0;
		for (Room room : hospital.getRooms()) {
			if (room != null)
				for (Patient p : room.getPatients()) {
					if (p != null)
						if (p.getDisease() == diseaseDescription) {
							peopleT++;
							sumT = sumT + p.getTimeToCure();
							summT = sumT / peopleT;
						}
				}
		}
		System.out.println(diseaseDescription + ": memuza time " + summT);
	}
//3.2
	public static void memuzeTimeToCureOfDiease(Hospital hospital) {
		int sumT = 0;
		int peopleT = 0;
		int summT = 0;
		int sumP = 0;
		int peopleP = 0;
		int summP = 0;
		int sumC = 0;
		int peopleC = 0;
		int summC = 0;
		int sumF = 0;
		int peopleF = 0;
		int summF = 0;
		int sumX = 0;
		int peopleX = 0;
		int summX = 0;

		for (Room room : hospital.getRooms()) {
			if (room != null)
				for (Patient p : room.getPatients()) {
					if (p != null)
						if (p.getDisease() == DiseaseDescription.TUBERCULOSIS) {
							peopleT++;
							sumT = sumT + p.getTimeToCure();
							summT = sumT / peopleT;
						}
					if (p.getDisease() == DiseaseDescription.PNEUMONIA) {
						peopleP++;
						sumP = sumP + p.getTimeToCure();
						summP = sumP / peopleP;
					}
					if (p.getDisease() == DiseaseDescription.COVID19) {
						peopleC++;
						sumC = sumC + p.getTimeToCure();
						summC = sumC / peopleC;
					}
					if (p.getDisease() == DiseaseDescription.FRACTORE) {
						peopleF++;
						sumF = sumF + p.getTimeToCure();
						summF = sumF / peopleF;
					}
					if (p.getDisease() == DiseaseDescription.CARDIO) {
						peopleX++;
						sumX = sumX + p.getTimeToCure();
						summX = sumX / peopleX;
					}
				}
		}
		System.out.println("COVID19 " + summC);
		System.out.println("PNEUMONIA " + summP);
		System.out.println("TUBERCULOSIS " + summT);
		System.out.println("FRACTORE " + summF);
		System.out.println("CARDIO " + summX);
}
//6
	//1
	public static void memuzeAge(Hospital hospital, DiseaseDescription diseaseDescription) {
		int sum = 0;
		int people = 0;
		int summ = 0;
		for (Room room : hospital.getRooms()) {
			if (room != null)
				for (Patient p : room.getPatients()) {
					if (p != null)
						if (p.getDisease() == diseaseDescription) {
							people++;
							sum = sum + p.getAge();
							summ = sum / people;
						}
				}
		}
		System.out.println(diseaseDescription + ": memuza age" + summ);
	}
//2
	public static void commonDisease(Hospital hospital) {
		int a = 0, b = 0, c = 0, d = 0, e = 0;
		for (Room room : hospital.getRooms()) {
			if (room != null)
				for (Patient p : room.getPatients()) {
					if (p != null)
						if (p.getDisease() == DiseaseDescription.TUBERCULOSIS) {
							a++;
						}
					if (p.getDisease() == DiseaseDescription.PNEUMONIA) {
						b++;
					}
					if (p.getDisease() == DiseaseDescription.COVID19) {
						c++;
					}
					if (p.getDisease() == DiseaseDescription.FRACTORE) {
						d++;
					}
					if (p.getDisease() == DiseaseDescription.CARDIO) {
						e++;
					}
				}
		}
		
		if (a > b && a > c && a > d && a > e) {
			System.out.println("TUBERCULOSIS");
		}
		else if (b > a && b > c && b > d && b > e) {
			System.out.println("PNEUMONIA");
		}
		else if (c > b && c > a && c > d && c > e) {
			System.out.println("COVID19");
		}
		else if (d > a && d > c && d > b && d > e) {
			System.out.println("PNEUMONIA");
		} else {
			System.out.println("CARDIO");

		}
	}
	//3
	public static void rareDisease(Hospital hospital) {
		int a = 0, b = 0, c = 0, d = 0, e = 0;
		for (Room room : hospital.getRooms()) {
			if (room != null)
				for (Patient p : room.getPatients()) {
					if (p != null)
						if (p.getDisease() == DiseaseDescription.TUBERCULOSIS) {
							a++;
						}
					if (p.getDisease() == DiseaseDescription.PNEUMONIA) {
						b++;
					}
					if (p.getDisease() == DiseaseDescription.COVID19) {
						c++;
					}
					if (p.getDisease() == DiseaseDescription.FRACTORE) {
						d++;
					}
					if (p.getDisease() == DiseaseDescription.CARDIO) {
						e++;
					}
				}
		}
		
		if (a < b && a < c && a < d && a < e) {
			System.out.println("TUBERCULOSIS");
		}
		else if (b < a && b < c && b < d && b < e) {
			System.out.println("PNEUMONIA");
		}
		else if (c < b && c< a && c < d && c < e) {
			System.out.println("COVID19");
		}
		else if (d < a && d < c && d < b && d < e) {
			System.out.println("PNEUMONIA");
		} else {
			System.out.println("CARDIO");

		}
	}
}

package Hospital;

public class Run {

	public static void main(String[] args) {

Hospital hospital = new Hospital();
System.out.println(hospital);

//System.out.println(HospitalStatistics.sumNumOfPeople(hospital));
//System.out.println(HospitalStatistics.memuzeTimeToCure(hospital));
//HospitalStatistics.memuzeTimeToCureOfDiease(hospital);
//System.out.println("===");
//HospitalStatistics.memuzeTime(hospital, DiseaseDescription.PNEUMONIA);
//System.out.println("====");
HospitalStatistics.commonDisease(hospital);
HospitalStatistics.rareDisease(hospital);
	}

}

package Hospital;

public class Doctor extends Person {

	private DiseaseDescription diseaseSpecialty;
	private int roomNumber;
	private int doctorNumber=0;
private static int number = 1;
private int sumDoctor=0;
	
	public int getSumDoctor() {
	return sumDoctor;
}
	public Doctor(int roomNumber) {
		super();
		++sumDoctor;
		this.diseaseSpecialty = DiseaseDescription.values()[(int)(Math.random()*DiseaseDescription.values().length)];
		this.roomNumber = roomNumber;
		this.doctorNumber = number++;

	}
	@Override
	public String toString() {
		return "Id " + super.getId() + ", name Doctor "+doctorNumber+", age "+ super.getAge()+ "specialist to cure "+ diseaseSpecialty + " and belong to room number "+ roomNumber;
	}
	public DiseaseDescription getDiseaseSpecialty() {
		return diseaseSpecialty;
	}
	public void setDiseaseSpecialty(DiseaseDescription diseaseSpecialty) {
		this.diseaseSpecialty = diseaseSpecialty;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	
}

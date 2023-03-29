package Hospital;

public class Patient extends Person {


	
	private DiseaseDescription disease;
	private int timeToCure;
	private int sumPatient=0;
	

	public int getSumPatient() {
		return sumPatient;
	}

	public Patient() {
		super();
		++sumPatient;
		this.disease = DiseaseDescription.values()[(int)(Math.random()*DiseaseDescription.values().length)];
		this.timeToCure = (int)(Math.random()*19)+3;
	}
	
	@Override
	public String toString() {
		return "\nid " +super.getId() + ", Patient" +super.getId() +",age"+super.getAge()+ ",has "+disease + ",and will be cured in approximately in " +timeToCure +" days";
	}

	public DiseaseDescription getDisease() {
		return disease;
	}

	public int getTimeToCure() {
		return timeToCure;
	}

	
	
	
	
}

package Hospital;

import java.util.Objects;

public class Disease {

	private DiseaseDescription  diseaseDescription;
	private static int timeToCure;
	
	
	public Disease() {
		super();
		this.diseaseDescription = DiseaseDescription.values()[(int)(Math.random()*DiseaseDescription.values().length)];
		this.timeToCure=(int)(Math.random()*19)+3;
	}

	@Override
	public String toString() {
		return "Disease Description: " +  diseaseDescription + ", Time To Cure: " + timeToCure;
	}

	
	public DiseaseDescription getDiseaseDescription() {
		return diseaseDescription;
	}


	public void setDiseaseDescription(DiseaseDescription diseaseDescription) {
		this.diseaseDescription = diseaseDescription;
	}


	public static int getTimeToCure() {
		return timeToCure;
	}


	public void  setTimeToCure(int timeToCure) {
		this.timeToCure =timeToCure;
	}

	@Override
	public int hashCode() {
		return Objects.hash(diseaseDescription);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disease other = (Disease) obj;
		return diseaseDescription == other.diseaseDescription;
	}

	
	
	
	
}

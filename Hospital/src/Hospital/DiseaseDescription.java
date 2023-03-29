package Hospital;

public enum DiseaseDescription {


	TUBERCULOSIS(0), PNEUMONIA(1), COVID19(2), FRACTORE(3), CARDIO(4);
	
	private	int value;

	private DiseaseDescription(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	
	
	
}

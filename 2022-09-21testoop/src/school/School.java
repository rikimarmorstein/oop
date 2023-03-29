package school;

import java.util.Arrays;

public class School {

	private ClassRoom [] classroom;
	

	public School() {
		super();
		classroom = new ClassRoom[5];
		for (int i = 0; i < classroom.length; i++) {
			classroom[i] = new ClassRoom();
		}
	}


	@Override
	public String toString() {
		return  Arrays.toString(classroom);
	}


	public ClassRoom[] getClassroom() {
		return classroom;
	}
	
	
	
}

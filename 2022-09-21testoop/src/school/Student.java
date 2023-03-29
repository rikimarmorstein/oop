package school;

import java.util.Arrays;

public class Student extends Person {

	private Grade[]grades;
	private static int c=1;

	public Student() {
		super();
		super.setName("Student" + c++);
		grades = new Grade[6];
		for (int i = 0; i < grades.length; i++) {
			grades[i] = new Grade();
		}
	}

	public Grade[] getGrades() {
		return grades;
	}

	@Override
	public String toString() {
		return "Student " + c+" grades=" + Arrays.toString(grades) +  "]";
	}


	
	
}

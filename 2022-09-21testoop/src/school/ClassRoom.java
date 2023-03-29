package school;

import java.util.Arrays;

public class ClassRoom {

	private String name;
	private Teacher teacher;
	private Student[]students ;
	private static int v=1;
	
	public ClassRoom() {
		super();
		this.name = "class: " + v++;
		teacher = new Teacher();
		
		students = new Student[15];
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
		}
	}


	public static int getV() {
		return v;
	}


	public String getName() {
		return name;
	}


	public Teacher getTeacher() {
		return teacher;
	}


	public Student[] getStudents() {
		return students;
	}


	@Override
	public String toString() {
		return  name + ", teacher - " + teacher.toString() +'\n'+ ", students=" + Arrays.toString(students) + '\n'
				 + '\n';
	}
	
	
	
}

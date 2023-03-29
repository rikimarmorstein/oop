package school;

public class SchoolStatistics {

	public static void main(String[] args) {

		School school = new School();
		System.out.println(school);
		
		System.out.println(averageSchoolGrade(school));
		classAverage("class: 1", school);
		averageProffession(Name.MATH, school);
		System.out.println(averageAgeOfStudents(school));
		sumStudent(school);
		
	}

	public static int averageSchoolGrade(School school) {
		int sum = 0;
		int i = 0;
		int summ = 0;
		for (ClassRoom classroom : school.getClassroom()) {
			if (classroom != null) {
				for (Student students : classroom.getStudents()) {
					if (students != null) {
						for (Grade grade : students.getGrades()) {
							sum = sum + grade.getScore();
							i++;
							summ = sum / i;
						}
					}
				}
			}
		}
		return summ;

	}

	public static void classAverage(String numClass, School school) {
		int sum = 0;
		int i = 0;
		int summ = 0;
		for (ClassRoom classroom : school.getClassroom()) {
			if (classroom != null && classroom.getName().equals(numClass)) {
				for (Student students : classroom.getStudents()) {
					if (students != null) {
						for (Grade grade : students.getGrades()) {
							sum = sum + grade.getScore();
							i++;
							summ = sum / i;
						}
					}
				}
			}
		}
		System.out.println("The class average of class number: " + numClass + " is " + summ);
	}

	
	public static void averageProffession( Name professions, School school) {
		int sum = 0;
		int i = 0;
		int summ = 0;
		for (ClassRoom classroom : school.getClassroom()) {
			if (classroom != null) {
				for (Student students : classroom.getStudents()) {
					if (students != null) {
						for (Grade grade : students.getGrades()) {
							if (grade.getProfessions() == professions) {
								sum = sum + grade.getScore();
								i++;
								summ = sum / i;
							}
						}
					}
				}
			}
		}
		System.out.println("School average for subject " + professions + " is " + summ);
	}

// bonus
	public static int averageAgeOfStudents(School school) {
		int sum = 0;
		int i = 0;
		int summ = 0;
		for (ClassRoom classroom : school.getClassroom()) {
			if (classroom != null) {
				for (Student students : classroom.getStudents()) {
					if (students != null) {
						sum = sum + students.getAge();
						i++;
						summ = sum / i;
					}
				}
			}
		}
		return summ;
	}

	public static void sumStudent(School school) {
		int sum = 0;
		int i = 0;
		int summ = 0;
		for (ClassRoom classroom : school.getClassroom()) {
			if (classroom != null) {
				for (Student students : classroom.getStudents()) {
					if (students != null && students.getAge() > 20 && students.getAge() < 30) {

						for (Grade grade : students.getGrades()) {
							sum = sum + grade.getScore();
							i++;
							summ = sum / i;
						}
					}
				}
			}
		}System.out.println("the students between the ages of 20 and 30:  " + i + ", sum grade " + summ);
	}
}

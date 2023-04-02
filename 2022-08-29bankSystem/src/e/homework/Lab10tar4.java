package e.homework;

import java.util.Arrays;

public class Lab10tar4 {

	public static void main(String[] args) {

		int sumk=0;
int [][]grades = new int[20][10];
for (int i = 0; i < grades.length; i++) {
	int sum = 0;

	for (int j = 0; j < grades[i].length; j++) {
		grades[i][j] = (int)(Math.random()*21)+80;
sum=sum+grades[i][j];
sumk=sumk + grades[i][j];
	}System.out.println(Arrays.toString(grades[i]));
	System.out.println(sum/grades[i].length);
}System.out.println(sumk/(20*10));
	


	}

}

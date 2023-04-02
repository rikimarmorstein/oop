package c.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedException {

	public static void main(String[] args) {
		File file = new File("c:/1/d.txt");

		try {

			Scanner sc = new Scanner(file);
			String line = sc.nextLine();
			System.out.println(line);
			sc.close();
		} catch (FileNotFoundException e) {

System.out.println("sory");
}
		
	}

}

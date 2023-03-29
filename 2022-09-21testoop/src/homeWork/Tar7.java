package homeWork;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Tar7 {

	public static void main(String[] args) {

Map<String, String> map = new LinkedHashMap<>();
map.put("dog", "an animal that barks"); 
map.put("car", "a vehicle");
map.put("java", "a programming language");

//System.out.println(map.get("dog"));

try(Scanner sc = new Scanner(System.in);){
System.out.println("enter word: ");
System.out.println(map.keySet());
String word = sc.nextLine();
System.out.println(map.get(word));


	
}
	}

}

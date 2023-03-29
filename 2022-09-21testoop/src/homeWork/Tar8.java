package homeWork;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Tar8 {

	public static void main(String[] args) throws DictionaryException {

		Map<String, String> map = new LinkedHashMap<>();
		map.put("dog", "an animal that barks"); 
		map.put("car", "a vehicle");
		map.put("java", "a programming language");

		//System.out.println(map.get("dog"));
		System.out.println(map.keySet());

		try(Scanner sc = new Scanner(System.in);){
		System.out.println("enter word: ");
		String word = sc.nextLine();
		System.out.println(map.get(word));
	//	}catch(DictionaryException d) {
			System.out.println("ggg");
		}
		
	}

}

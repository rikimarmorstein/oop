package homeWork;

import java.util.Map;
import java.util.TreeMap;

public class Tar9 {

	public static void main(String[] args) {


		String str = "abra cadabra";
		Map<Character, Integer> map = new TreeMap<>();
		
		for (int i = 0; i <str.length(); i++) {
			if(str.charAt(i) != ' ') {
				if (map.containsKey(str.charAt(i))){
					map.put(str.charAt(i), map.get(str.charAt(i))+1);
				}else {
					map.put(str.charAt(i), 1);
				}
			}
			
		}for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
			
			
		}//System.out.println(map);
	}

}

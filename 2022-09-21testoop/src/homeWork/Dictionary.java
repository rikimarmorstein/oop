package homeWork;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Consumer;

public class Dictionary {

	private Map<String, String> map = new TreeMap<>();

	public void addEntry(String str, String st) throws DictionaryException {
		if (str != null && st != null && st.length() > 0) {
			if (map.containsKey(str) == false) {
				map.put(str, st);
			} else {
				throw new DictionaryException("The word already exists in the dictionary");
			}
		} else {
			throw new DictionaryException("An empty value cannot be added");
		}
	}

	public String getDefinition(String str) {

		return map.get(str);

	}

	public void editEntry(String str, String st) throws DictionaryException {
		if (map.containsKey(str) == true) {
			map.put(str, st);
		} else {
			throw new DictionaryException("An empty value cannot be added");
		}
	}
	
	public String deleteEntry(String str) {
		if (map.containsKey(str) == true) { 
		
		map.remove(str);
		System.out.println(str + " delete");
		}else {
			 System.out.println("Entry not delete - wotd not found");
	}return str;
	}

	public  Set<String> getAllEntriesSorted(){
	 Set<String> words =map.keySet();
	 return words;
	}

}

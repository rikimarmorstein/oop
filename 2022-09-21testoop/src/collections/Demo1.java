package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {

List<String> list= new ArrayList<>();
System.out.println("is empyt? " + list.isEmpty());

boolean added =list.add("ddd");
System.out.println("added? "+ added);


added = list.add("MMM");
added = list.add("SSS");
added = list.add("FFF");
added = list.add("BBB");

System.out.println("added? "+ added);

System.out.println("size: "+list.size());
System.out.println(list);
	
boolean m = list.remove("DDD");
System.out.println(m);
System.out.println(list);
System.out.println("is empyt? " + list.isEmpty());

System.out.println("contains BBB? " + list.contains("BBB"));

System.out.println(list.get(0));
System.out.println(list.get(1));
System.out.println(list.get(2));
//lahavor mlist lemaharach
//convert from collections to Array of Object
Object [] objects = list.toArray();
//convert from collections to Array of specitied type
String[]strings = list.toArray(new String[0]);

System.out.println(Arrays.toString(objects));
	System.out.println(Arrays.toString(strings));
	
	list.clear();
	System.out.println(list);
	}

}

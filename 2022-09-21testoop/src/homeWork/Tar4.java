package homeWork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Tar4 {

	public static void main(String[] args) {


		Set<String> str = new HashSet<String>();
		str.add("Rivka");
		str.add("Rachel");
		str.add("Sara");
System.out.println(str);

Iterator<String> it = str.iterator();

for (int i = 0; it.hasNext(); i++) {
	String g = it.next();
	if(i==2) {
		System.out.println(g);
		break;
	}
}


Iterator<String> it2 = str.iterator();
String curr =it2.next();
String curr2 = it2.next();
String curr3 = it2.next();

System.out.println("3th name: "+ curr3);
	}

}

package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {


		Set<String> set = new HashSet<>();
	//	Set<String> set = new LinkedHashSet<>();
	//	Set<String> set = new TreeSet<>();
		set.add("AAA");
			set.add("AAAAAAA");
			set.add("CCC");
			set.add("BBB");
System.out.println(set);

//get ah Iterator of a collection

Iterator<String> it = set.iterator();
while(it.hasNext()) {
	String curr = it.next();
System.out.println(curr);
if(curr.length()>3){
	it.remove();
}
}
System.out.println(set);

//chek length of int example
int id = 123456;
Integer idObj = id;
System.out.println(idObj.toString().length());

	}

}

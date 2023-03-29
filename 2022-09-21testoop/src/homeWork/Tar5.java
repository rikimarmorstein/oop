package homeWork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Tar5 {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();
	//	Set<Integer> set = new LinkedHashSet<Integer>();
		while( set.size()<10) {
		int t = (int)(Math.random()*11);
		set.add(t);
		}System.out.println(set);
		
		Iterator<Integer> it = set.iterator();
		while( it.hasNext()) {
			if (it.next()%2==0) {
				it.remove();
			}
	}System.out.println(set);
	}
}

package homeWork;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Tar3 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			int integer = (int)(Math.random()*6)+5;
			list.add(integer);
		}System.out.println(list);
		Set<Integer> set = new LinkedHashSet<Integer>(list);
	//	System.out.println(set);
		list.clear();
		list.addAll(set);
		System.out.println(list);
	}

}

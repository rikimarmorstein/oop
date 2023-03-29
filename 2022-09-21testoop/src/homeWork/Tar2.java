package homeWork;

import java.util.ArrayList;
import java.util.List;

public class Tar2 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			int integer = (int)(Math.random()*61)+20;
			list.add(integer);
		}System.out.println(list);
		System.out.println("number of elements: "+ list.size());
		System.out.println("first element: "+ list.get(0));
		System.out.println("last element: "+ list.get(list.size()-1));
		System.out.println("10th element: "+ list.get(9));
		
		System.out.print("number 25 in index: ");
		for (int i = 0; i < 100; i++) {
				if(list.get(i)==25) {
					System.out.print(i + ", ");
				}
	
		}
System.out.println();
		boolean contains;
		contains = list.contains(25);
		System.out.println("contains 25? " + contains);
		if(contains) {
			System.out.println("in index: " + list.indexOf(25));
		}
		
}
	

}

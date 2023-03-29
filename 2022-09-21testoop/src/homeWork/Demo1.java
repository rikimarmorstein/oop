package homeWork;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {


		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			Integer integer = (int)(Math.random()*101)+1;
			list.add(integer);
		}System.out.println(list);
		
		System.out.println(list.get(2));
		
		int sum=0;
		for (int i = 0; i < 3; i++) {
			sum += list.get(i);
		}System.out.println(sum);
		
		int sum1=0,summ=0;
		for (int i = 0; i < 3; i++) {
			sum1 += list.get(i);
			summ=sum/(i+1);
	}System.out.println(summ);
	
	System.out.println("third element: " + list.get(2));
	
	
	}
}

package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo3 {

	public static void main(String[] args) {

List<Integer> list  = new ArrayList<>();
for (int i = 0; i < 10; i++) {
	int r=(int)(Math.random()*10)+1;
	list.add(r);
}
System.out.println(list);

Set<Integer> set = new HashSet<>();
while (set.size() < 10) {
	int r=(int)(Math.random()*10)+1;
	set.add(r);
}System.out.println(set);

	}

}

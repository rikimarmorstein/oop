package e.homework;

import java.util.Arrays;

public class Lab7 {

	public static void main(String[] args) {

		String str = "Sara Shara Shir Sameach";
char [] sara = str.toCharArray();

int y=0;
for (int i = 0; i < sara.length; i++) {
switch(sara[i]){
case 'a', 'e', 'i', 'u', 'o', 'A', 'E', 'I', 'O', 'U':
	y++;
}
}

System.out.println(Arrays.toString(sara));
		System.out.println(y);
		
		String s= "John Bryce";
		char[] john= s.toCharArray();
		
		int g=0;
		for (int i = 0; i < john.length; i++) {
					if (john[i]=='h') {
						g++;
					}

		}System.out.println(Arrays.toString(john));
		System.out.println(g);
	}

}

package e.homework;

import java.util.Arrays;

public class Lab9tar5 {

	public static void main(String[] args) {

int[]arr = new int[10];
for (int i = 0; i < arr.length; i++) {
	arr[i] = (int)(Math.random()*101);
	
}System.out.println(Arrays.toString(arr));

int sum = 0;
int sumno=0;
for (int i = 0; i < arr.length; i++) {
	if (arr[i]%2==0) {
		sum = sum+arr[i];
	}else {
		sumno=sumno+arr[i];
	}
}System.out.println(sum);
System.out.println(sumno);
if (sum>sumno) {
	System.out.println(sum);
}else {
	System.out.println(sumno);
}
	}

}

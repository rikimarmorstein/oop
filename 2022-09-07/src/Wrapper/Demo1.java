package Wrapper;

import javax.swing.JOptionPane;

public class Demo1 {

	public static void main(String[] args) {

		int a=5;//primitive
		Integer d=5;//object
		System.out.println(a + ","+d);

		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);

		System.out.println("======");
		
		
		String userInput = JOptionPane.showInputDialog("enter tha number");
		System.out.println(userInput);
		int val = Integer.parseInt(userInput);//כדי להמיר את ה string למספר
	
	}

}

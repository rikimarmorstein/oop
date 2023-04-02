package e.homework;

public class Lab5tar4 {

	public static void main(String[] args) {


		int u= (int)(Math.random()*10001);
		int y=u;
		System.out.println(u);
		int a=0;
		while (u>0) {
			a=a*10;
			a=a+(u%10);
			u=u/10;
		}if (y%10==0) {
			System.out.println("0" + a);
		}else {
		System.out.println(a);
	}
	}
}

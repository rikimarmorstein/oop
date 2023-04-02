package b;

public class TestCalculator {

	public static void main(String[] args) {


		Calculator calculator = new Calculator();
		
		int sum = calculator.add(4, 8);
		System.out.println(sum);
		
		try {
			System.out.println(calculator.div(8, 4));
		System.out.println(calculator.div(8, 0));
		}catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
System.out.println("End");
	}

}

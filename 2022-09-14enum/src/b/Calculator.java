package b;

public class Calculator {

	public int add(int a, int b) {
		int res = a + b;
		return res;
	}

	public int div(int a, int b) throws Exception{
		if (b != 0) {
			int res = a / b;
			return res;
		} else {
			Exception e = new Exception("cannot dividee by zero");
			throw e;
		}

	}
}

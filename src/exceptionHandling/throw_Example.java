package exceptionHandling;

public class throw_Example {

	public int div(int x, int y) {
		if (y == 0) {
			throw new ArithmeticException("Cannot divide by zero");
		}
		return x / y;
	}

	public static void main(String[] args) {
		throw_Example example = new throw_Example();
		try {
			int result = example.div(10, 0);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}

package all;

public class exceptionHandling {
//multiple exceptions
	static void exceptionHandling_1() {
		try {
			int number[] = new int[9];
			number[10] = 30 / 0;
			// Arithmetic operation checked from right to left
			// Hence divide by zero caught here
		} catch (ArithmeticException e) {
			System.out.println("Zero cannot divide any number");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of size of the array");
		}
	}

	// multiple exceptions in 1 catch
	static void exceptionHandling_2() {
		try {
			int number[] = new int[9];
			number[10] = 30 / 1;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

	// throws
	static void exceptionHandling_3() throws ArithmeticException, ArrayIndexOutOfBoundsException {
		try {
			int number[] = new int[9];
			number[10] = 30 / 0;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) {
		// function call
		// fizzBuzz(50, 3, 5);
		exceptionHandling_3();
	}
}

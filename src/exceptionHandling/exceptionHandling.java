package exceptionHandling;

public class exceptionHandling {
//multiple exceptions
	static void exceptionHandling_1() {
		try {
			int number[] = new int[9];
			int n = number[10];
			int j = 30 / 0;
			// Arithmetic operation checked from right to left
			// Hence divide by zero caught here
		} catch (ArithmeticException e) {
			System.out.println("can't divide by zero");
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

	// here 'Exception' is parent of all exception
	// and if we do not know which exception will arise then it is good to have
	// Exception code in last catch block
	static void exceptionHandling_4() {
		String str = null;
		try {
			System.out.println(str.length());
			int number[] = new int[9];
			int n = number[10];
			int j = 30 / 0;
			// Arithmetic operation checked from right to left
			// Hence divide by zero caught here
		} catch (ArithmeticException e) {
			System.out.println("can't divide by zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of size of the array");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		// function call

//		exceptionHandling_1();
//		exceptionHandling_2();
//		exceptionHandling_3();
		exceptionHandling_4();
	}
}

package exceptionHandling;

public class throws_Example {
	// Issue is here but we did not catch exception
	public void A() {
		int result = 12 / 0;
		System.out.println(result);

	}

	// Issue is here but we did not catch exception
	public void B() {
		int[] a = new int[2];
		int b = a[3];
	}

	// Ducking exceptions using throws keyword
	public void C() {
		// Handling exceptions here for above all methods
		A();
		B();
	}

	public static void main(String[] args) throws Exception {
		throws_Example t = new throws_Example();
		try {
			t.C();
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			// e.printStackTrace();
		}
	}

}

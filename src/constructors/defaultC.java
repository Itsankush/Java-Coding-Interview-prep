package constructors;

public class defaultC {
	static void sum(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}

	defaultC() {
		System.out.println("In Costructor 1");
	}

	defaultC(int a) {
		this();
		System.out.println("In Costructor 2");
	}

	public static void main(String[] args) {
		defaultC d = new defaultC(2);
		sum(1, 3);
	}

}

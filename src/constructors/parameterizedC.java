package constructors;

public class parameterizedC {

	int a;
	int b;

	parameterizedC(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println(a + b);
	}

	static void sum(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		parameterizedC d = new parameterizedC(1, 3);
		sum(1, 3);
	}

}

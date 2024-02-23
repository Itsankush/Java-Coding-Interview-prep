package Method_Overloading;

public class demo {

	static void show(int a, int b) {
		System.out.println("method 1");
	}

	static void show(String a, int b) {
		System.out.println("method 2");
	}

	public static void main(String[] args) {
		demo.show(null, 0);
	}

}

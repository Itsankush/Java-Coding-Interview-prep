package abstraction;

public abstract class demo {

	static void get() {
		System.out.println("A");
	}

	abstract void get2();

	public static void main(String[] args) {
		//demo d = new demo();
		demo.get();
	}

}

package inheritance;

@FunctionalInterface
interface A {
	// Only 1 method is allowed when we declare @FunctionalInterface annotation.
	void show();
}

class B implements A {

	public void show() {
		System.out.println("Functional Interface");
	}

	public void get() {
		System.out.println("get");
	}

}

public class functional_Interface {

	public static void main(String[] args) {
		B obj = new B();
		obj.show();
		obj.get();
	}

}

package final_Keyword;

// Note:- final methods can not be overridden and final class can not be extended.
class A {
	public final void show() {
		System.out.println("done by Ankush");
	}
}

class B extends A {
	// here we can't override show() method as it is declared as final method.
}

final class C {
	public void send() {
		System.out.println("Ankush");
	}
}

// here we can't extends C class as it is declared as final class.
class D {

}

public class finalClassMethod {

	public static void main(String[] args) {

	}

}

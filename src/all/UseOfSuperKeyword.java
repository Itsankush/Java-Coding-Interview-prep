package all;

class class1 {
	class1() {
		System.out.println("Constructor call of A");
	}

	void get() {
		System.out.println("A get");
	}
}

public class UseOfSuperKeyword extends class1 {

	void get() {
		super.get();
		System.out.println("get call");
	}

	UseOfSuperKeyword() {
		// super();
		System.out.println("Constructor call");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseOfSuperKeyword a = new UseOfSuperKeyword();
		// superclass will be called automatically if we do not call it explicitly i.e.
		// using super keyword.
		a.get();
	}

}

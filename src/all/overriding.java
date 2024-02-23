package all;

class parent {
	void phone() {
		System.out.println("Nokia 1600");
	}
}

class child extends parent {
	// here it will override phone method of parent class
	void phone() {
		System.out.println("Samsung A50");
	}
}

public class overriding {

	public static void main(String[] args) {
		child a = new child();
		a.phone();
	}

}

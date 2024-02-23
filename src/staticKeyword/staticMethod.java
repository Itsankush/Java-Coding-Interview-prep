package staticKeyword;

public class staticMethod {
	// we can not access non static members inside static members
	static String brand = "Nokia";
	String name;

	// constructor
	staticMethod() {
		name = "Supernova";
	}

	void show() {
		System.out.println(brand + " : " + name);
	}

	// this is way to access non static members inside static members
	static void show1(staticMethod obj) {
		System.out.println(brand + " : " + obj.name);
	}

	public static void main(String[] args) {
		staticMethod sm = new staticMethod();
		show1(sm);
	}

}

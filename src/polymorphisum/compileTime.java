package polymorphisum;

public class compileTime {

	public void get(int a) {
		System.out.println("first");
	}

	public void get(int a, int b) {
		System.out.println("second");
	}

// here overloading took place which is compile Time Polymorphism
	public static void main(String[] args) {
		compileTime ct = new compileTime();
		ct.get(1, 3);
	}

}

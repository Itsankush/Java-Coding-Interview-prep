package abstraction;

public class abstractedMethodRun extends secondExample {

	@Override
	void subtract() {
		// TODO Auto-generated method stub
		System.out.println("Subtraction perfomed");
	}

	public static void main(String[] args) {
		abstractedMethodRun f = new abstractedMethodRun();
		f.subtract();
		f.add();
		f.multiply();
	}

}

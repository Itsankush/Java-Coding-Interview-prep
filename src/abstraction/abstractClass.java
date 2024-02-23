package abstraction;

public abstract class abstractClass {
	
	final String name="name";

	protected void add() {
		System.out.println("Addition perfomed");
	}

	abstract void subtract();

	public void multiply() {
		System.out.println("Multiplication perfomed");
	}

}

abstract class secondExample extends abstractClass {
	public void add() {
		System.out.println("Addition perfomed after exteds");
	}

	abstract void subtract();

	public void multiply() {
		System.out.println("Multiplication perfomed after exteds");
	}
}



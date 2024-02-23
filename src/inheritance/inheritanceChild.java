package inheritance;

public class inheritanceChild extends inheritanceParent {
	void get() {
		System.out.println("Inside child");
	}

	void getC() {
		System.out.println("Inside getC");
	}

	public static void main(String[] args) {

		inheritanceParent a = new inheritanceParent();
		inheritanceParent b = new inheritanceChild();
		inheritanceChild c = new inheritanceChild();
		// inheritanceChild d=new inheritanceParent(); --not allowed
		// child d=new inheritance_eg(); //this is not case

		a.get();
		a.getP();
		b.get();
		b.getP();
		c.get();
		c.getC();
		c.getP();

	}
}

package polymorphisum;

class parentP {
	void phone() {
		System.out.println("Nokia 1600");
	}
}

class childC extends parentP {
	// here it will override phone method of parent class
	void phone() {
		System.out.println("Samsung A50");
	}
}

// here overriding happening which is run time Polymorphism
public class runTime {

	public static void main(String[] args) {
		childC a = new childC();
		a.phone();
	}

}

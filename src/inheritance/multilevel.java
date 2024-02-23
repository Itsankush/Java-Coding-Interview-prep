package inheritance;

class cal {
	int add(int a, int b) {
		return a + b;
	}

	int sub(int a, int b) {
		return a - b;
	}
}

class advCalc extends cal {
	int multi(int a, int b) {
		return a * b;
	}

	float div(float a, float b) {
		return a / b;
	}
}

class veryAdvCalc extends advCalc {
	double power(int a, int b) {
		return Math.pow(a, b);
	}

}

public class multilevel {

	public static void main(String[] args) {
		veryAdvCalc cal = new veryAdvCalc();
		int r1 = cal.add(1, 2);
		float r2 = cal.div(15, 2);
		double r3 = cal.power(2, 3);
		System.out.println(r1 + ", " + r2 + ", " + r3);
	}

}

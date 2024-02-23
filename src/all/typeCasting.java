package all;

public class typeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a = 6, b = 4, e = 10;
		double myDouble = e; // Auto casting
		long d = (long) (a / b); // Manual casting
		float c = a / b;

		System.out.println(d + " " + c + " " + myDouble);

	}

}

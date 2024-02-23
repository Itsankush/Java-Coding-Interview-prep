package all;

public class Simple_Interest_Calc {

	public static void main(String[] args) {
		double year = 15;
		double principal = 2200000.9;
		int interest_rate = 9;
		float total_Interest = 0;

		total_Interest = (float) ((principal * interest_rate * year) / 100);
		System.out.println("Total Interest would be:- " + total_Interest);

	}

}

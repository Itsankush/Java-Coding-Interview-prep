package Method_Overloading;

public class Test1 {

	public static void Sal_Increment(double percent) {
		int CTC = 20000;
		double total_CTC = 0;

		if (percent > 0) {
			double temp = CTC * (percent / 100);
			total_CTC = temp + CTC;
		}
		System.out.println("Old CTC: " + CTC);
		System.out.println("Increment: " + percent + " %");
		System.out.println("Total CTC became: " + total_CTC);
	}

	public static void Sal_Increment(double percent, double variable) {
		int CTC = 20000;
		double total_CTC = 0, var = 0;

		if (percent > 0) {
			double temp = (CTC * (percent / 100));
			temp = temp + CTC;
			var = temp * (variable / 100);
			total_CTC = temp + var;
		}
		System.out.println("Old CTC: " + CTC);
		System.out.println("Increment: " + percent + " %");
		System.out.println("Variable: " + var);
		System.out.println("Total CTC became: " + total_CTC);
	}

	public static void main(String[] args) {
		double percent = 20;
		double variable = 20;
		System.out.println("Original Method");
		Sal_Increment(percent);
		System.out.println("#################################");
		System.out.println("Overloaded Method");
		Sal_Increment(percent, variable);
	}

}

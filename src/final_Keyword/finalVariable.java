package final_Keyword;

import java.util.Scanner;

public class finalVariable {
	// We can't change value for pi variable now
	final static double pi = 3.14;

	void calc() {
		System.out.println("Value of pie is:- " + pi);
	}

	public static void main(String[] args) {

		finalVariable a = new finalVariable();
		a.calc();

		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter radious of circle:-");
			double r = input.nextDouble();

			double area = 2 * pi * r;
			System.out.println(area);
		}
	}

}

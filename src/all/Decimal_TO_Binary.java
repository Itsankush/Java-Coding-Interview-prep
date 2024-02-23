package all;

public class Decimal_TO_Binary {

	static void show_BinaryNumber(int n) {
		int bin = 0;
		while (n != 0) {
			int a = n % 10;
			bin = bin * 10 + a;
			n = n / 10;
		}
		System.out.println(bin);
		//here binary number is reversed in correct format
	}

	public static void main(String[] args) {
		int d = 125;
		int rev = 0;
		while (d != 0) {
			int Q = d % 2;
			rev = rev * 10 + Q;
			d = d / 2;
		}
		// here decimal to binary conversion done but not fully
		int num = rev;

		show_BinaryNumber(num);

		// System.out.println(rev);
	}

}

package arrays;

//123 = 1^3+2^3+3^3 = 1+8+27 = sum, sum should be equal to num
public class Armstrong {
	public static void main(String[] args) {

		int num = 123;
		double rev = 0;
		int temp = num;

		while (num != 0) {

			int n = num % 10;
			double cube = Math.pow(n, 3);
			rev = rev + cube;
			num = num / 10;

		}
		if (temp == rev) {
			System.out.println("ArmStrong number");
		} else
			System.out.println("Not ArmStrong");
	}

}

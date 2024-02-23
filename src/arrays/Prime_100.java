package arrays;

public class Prime_100 {

	public static void main(String[] args) {

		for (int n = 2; n < 100; n++) {
			boolean flag = true; // setting flag true each time
			int m = n / 2; // just to reduce time of execution
			
			for (int i = 2; i < m; i++) {
				if (n % i == 0) {
					// not prime
					flag = false;
					break;
				}
			}
			if (flag) {
				// prime
				System.out.print(n + " ");
			}
		}
	}
}
package arrays;

public class miss_Number_inSeries {
	// we should know start and end of series
	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}

		int total = 0;
		int n = 1;
		int end = 10;
		while (n <= end) {
			total = total + n;
			n++;
		}

		System.out.println(total - sum);
	}

}

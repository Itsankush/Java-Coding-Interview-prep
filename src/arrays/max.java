package arrays;

public class max {

	public static void main(String[] args) {

		int[] a = { 10, 3, 20, 34, 6, 56, 1 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		System.out.println(max);
	}

}

package arrays;

public class merge_and_sort {

	// merge array a, b into resultant array c
	public static void merge(int[] a, int[] b, int[] c) {
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[i + a.length] = b[i];
		}
	}

	// sort resultant array c
	public static void sort(int[] c) {
		int max = 0;
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] > c[j]) {
					max = c[i];
					c[i] = c[j];
					c[j] = max;
				}
			}
		}

		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 2, 6, 4, 7, 9 };
		int[] b = { 11, 18, 13, 19, 14, 12 };
		int[] c = new int[a.length + b.length];

		merge(a, b, c);
		sort(c);

	}

}

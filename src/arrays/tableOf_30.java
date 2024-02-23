package arrays;

public class tableOf_30 {

	static void table(int n, int[] a) {
		for (int i = 1; i < n; i++) {
			a[i] = 3 * i;
			System.out.println(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		int n = 11;
		int[] a = new int[n];
		table(11, a);
	}

}

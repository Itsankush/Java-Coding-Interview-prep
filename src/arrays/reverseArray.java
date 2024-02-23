package arrays;

public class reverseArray {

	static void rev_by_creating_new_array(int[] a) {
		int[] b = new int[a.length];
		int n = a.length - 1;

		for (int i = a.length - 1; i >= 0; i--) {
			b[n - i] = a[i];
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

	static void rev_by_NOT_creating_new_array(int[] a) {
		int n = a.length - 1;
		int temp;
		for (int i = 0; i < a.length / 2; i++) {
			temp = a[i];
			a[i] = a[n - i];
			a[n - i] = temp;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {

		int[] a = { 1, 10, 5, 4, 7, 3, 8, 9, 10 };

		rev_by_creating_new_array(a);
		System.out.println();
		rev_by_NOT_creating_new_array(a);
	}

}

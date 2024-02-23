package arrays;

// split array into two parts logic:- "array1 > digit < array 2"
public class split_array_by_digit {
	public static void distribute(int[] a, int[] b, int[] c, int digit) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == digit) {
				b[i] = a[i];
			} else if (a[i] > digit) {
				b[i] = a[i];
			} else
				c[i] = a[i];
		}
	}

	public static void disp(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] a = { 1, 3, 10, 50, 11, 4, 5, 32, 20 };
		int[] b = new int[a.length];
		int[] c = new int[a.length];

		int digit = 12;

		distribute(a, b, c, digit);
		System.out.print("Array b: ");
		disp(b);
		System.out.print("Array c: ");
		disp(c);
	}

}

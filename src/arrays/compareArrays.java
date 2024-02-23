package arrays;

import java.util.Arrays;

public class compareArrays {
	static void compare(int[] a, int[] b) {
		boolean flag = true;
		if (a.length != b.length) {
			System.out.println("Arrays don't have same size");
		} else {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("Arrays are identical");
			} else
				System.out.println("Arrays are not identical");
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 6, 3, 4, 5, 2, 7, 8 };
		int[] b = { 1, 2, 4, 3, 5, 6, 7, 8 };
		Arrays.sort(a);
		Arrays.sort(b);
		compare(a, b);
	}

}

package arrays;

import java.util.Arrays;

public class Intersection_2_Array {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 1, 6, 2, 7, 3, 5, 8 };
		Arrays.sort(a);
		Arrays.sort(b);
		int[] c = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					c[j] = a[i];
				}
			}
		}
		for (int i = 0; i < c.length; i++) {
			if (c[i] != 0) {
				System.out.println(c[i]);
			}
		}
	}

}

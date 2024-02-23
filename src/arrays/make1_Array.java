package arrays;

import java.util.Arrays;

public class make1_Array {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = { 4, 5, 6 };
		int[] c = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[a.length + i] = b[i];
		}
		
		// Arrays.toString(c) is another way to print array.
		System.out.println(Arrays.toString(a) + " + " + Arrays.toString(b));
		System.out.println("Addition:- " + Arrays.toString(c));
	}

}

package arrays;

import java.util.Arrays;

public class copyArray {
	int[] a1, a2;

	public static void copy_Array(int[] a1) {
		int[] a2 = new int[a1.length];
		for (int i = 0; i < a1.length; i++) {
			a2[i] = a1[i];
		}
		Arrays.sort(a2);
		for (int j = 0; j < a2.length; j++) {
			System.out.print(a2[j] + " ");
		}
		System.out.println();
		//System.out.print(Arrays.toString(a2));

	}

	public static void main(String[] args) {
		int[] arr1 = { 12, 3, 10, 7 };
		copy_Array(arr1);

	}

}

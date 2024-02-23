package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set_removeDup {

	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 5, 1, 2, 3, 4, 6, 8, 6, 0, 7, 0 };
		// Original Array
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		// here only unique elements will add
		Set<Integer> set = new HashSet<>();
		for (int i : a) {
			set.add(i);
		}

		// System.out.println(set);
		System.out.println();
		// Converting Set to array
		Integer[] b = set.toArray(new Integer[0]);
		System.out.println("Array with duplicates removed: ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

}

package arrays;

import java.util.ArrayList;

public class findUniqueElement {

	public static void main(String[] args) {
		int[] a = { 1, 4, 4, 1, 6, 8, 8, 8, 7, 8 };

		ArrayList<Integer> ab = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!ab.contains(a[i])) {
				ab.add(a[i]);
				k++;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;
					}
				}
			}
			if (k == 1) {
				System.out.println("Unique number= " + a[i]);
			}
		}

	}

}

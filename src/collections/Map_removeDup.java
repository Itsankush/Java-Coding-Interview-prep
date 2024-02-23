package collections;

import java.util.HashMap;
import java.util.Set;

public class Map_removeDup {

	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 5, 1, 2, 3, 4, 6, 8, 6, 0, 7 };

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i : a) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else
				map.put(i, 1);
		}
		System.out.println(map);
		// Converted to set
		Set<Integer> set = map.keySet();
		System.out.println(set);
		Integer[] b = set.toArray(new Integer[0]);
		System.out.print("Array with duplicates removed: ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}

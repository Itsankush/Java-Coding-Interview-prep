package collections;

import java.util.HashMap;
import java.util.Map;

public class Map_count_Integer {

	public static void main(String[] args) {
		int[] a = { 1, 4, 6, 4, 8, 7, 2, 3, 1, 6, 1, 4 };
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer c : a) {

			if (map.containsKey(c)) {
				// increment value by 1
				map.put(c, map.get(c) + 1);
			} else {
				// add char to map
				map.put(c, 1);
			}
		}
		// System.out.println(map);
		for (Map.Entry<Integer, Integer> i : map.entrySet()) {
			if (i.getValue() > 1) {
				System.out.println(i.getKey() + ":" + i.getValue() + " times");
			}
		}
	}
}

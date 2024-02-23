package collections;

//find repeated integers from multiple arrays
import java.util.*;

public class Dup_int_in_Arrays {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = { 1, 2, 3, 4 };
		int[] c = { 5, 2, 3, 1 };
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);

		Map<Integer, Integer> map = new HashMap<>();
		for (Integer n : a) {
			if (map.containsKey(n)) {
				map.put(n, map.get(n) + 1);
			} else
				map.put(n, 1);
		}
		for (Integer n : b) {
			if (map.containsKey(n)) {
				map.put(n, map.get(n) + 1);
			} else
				map.put(n, 1);
		}
		for (Integer n : c) {
			if (map.containsKey(n)) {
				map.put(n, map.get(n) + 1);
			} else
				map.put(n, 1);
		}
		System.out.println(map);

		for (Map.Entry<Integer, Integer> s : map.entrySet()) {
			if (s.getValue() > 1) {
				System.out.println(s.getKey() + " ");
			}
		}
	}

}

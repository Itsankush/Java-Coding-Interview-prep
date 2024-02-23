package collections;

import java.util.HashMap;
import java.util.Map;

public class Hashmap_Copy_ {

	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map1.put(1, "abc");
		map1.put(2, "def");
		map1.put(3, "ghi");
		// System.out.println(map1);
		map2.put(4, "jkl");
		map2.put(5, "mno");
		map2.put(6, "pqr");
		// System.out.println(map2);
		// copy map1 to map2
		map2.putAll(map1);

		// System.out.println(map2);
		for (Map.Entry<Integer, String> m : map2.entrySet()) {
			System.out.println(m.getKey() + ":" + m.getValue());
		}
	}
}

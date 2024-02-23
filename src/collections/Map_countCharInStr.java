package collections;

import java.util.HashMap;
import java.util.Map;

public class Map_countCharInStr {

	public static void main(String[] args) {
		String str = "ankushpopatfartale";
		char[] a = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character c : a) {

			if (map.containsKey(c)) {
				// increment value by 1
				map.put(c, map.get(c) + 1);
			} else {
				// add char to map
				map.put(c, 1);
			}
		}
		for (Map.Entry<Character, Integer> c : map.entrySet()) {
			if (c.getValue() > 1)
				System.out.println(c.getKey() + ":" + c.getValue());
		}
		// System.out.println(map);
	}

}

package collections;

import java.util.*;

public class Str_with_count {

	public static void main(String[] args) {
		String a = "aabbccddee";

		Map<Character, Integer> map = new HashMap<>();
		for (Character c : a.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		for (Map.Entry<Character, Integer> s : map.entrySet()) {
			System.out.print(s.getValue() + "" + s.getKey());
		}
	}

}

package collections;

import java.util.*;

public class count_with_Char {

	public static void main(String[] args) {
		String st = "abcaaccabc";

		Map<Character, Integer> map = new HashMap<>();
		for (Character c : st.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		for (Map.Entry<Character, Integer> m : map.entrySet()) {
			System.out.print(m.getValue() + "" + m.getKey());
		}
	}

}

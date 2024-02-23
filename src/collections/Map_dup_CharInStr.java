//Find duplicate char from given String
package collections;

import java.util.HashMap;
import java.util.Map;

public class Map_dup_CharInStr {

	public static void main(String[] args) {

		String a = "aaankkushhh";
		char[] chararray = a.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : chararray) {
			if (map.containsKey(c)) {
				// If character is present
				// in map incrementing it's
				// count by 1
				map.put(c, map.get(c) + 1);
			} else {
				// If character is not present
				// in map putting this
				// character into map with
				// 1 as it's value.
				map.put(c, 1);
			}
		}
		System.out.println(map);
		// Traverse the HashMap, check
		// if the count of the character
		// is greater than 1 then print
		// the character and its frequency
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
	}
}

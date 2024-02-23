package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_keySet {

	public static void main(String[] args) {
		Map<String, Character> map = new HashMap<String, Character>();
		map.put("Banana", 'b');
		map.put("Mango", null);
		map.put("Jackfruit", 'j');
		map.put("Watermelon", 'w');
		map.put("Cucumber", 'c');
		// This method returns the value associated with the specified key, or null if
		// the key is not present in the map.
		System.out.println(map.get("Mango"));
		System.out.println(map.get("Banana"));
		// This method returns a Set containing all the keys in the map
		Set<String> s = map.keySet();
		System.out.println(s);
	}
}

package collections;

import java.util.HashMap;
import java.util.Map;

public class arrayInHashMap {

	public static void main(String[] args) {
		HashMap<String, String[]> map = new HashMap<String, String[]>();
		String array[] = { "one", "two" };

		map.put("arr", array);
		for (Map.Entry<String, String[]> m : map.entrySet()) {
			System.out.println(m.getKey() + m.getValue());

		}

	}

}

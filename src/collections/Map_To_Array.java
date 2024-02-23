package collections;

import java.util.Arrays;
import java.util.HashMap;

public class Map_To_Array {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "I");
		map.put(2, "am");
		map.put(3, "java");
		map.put(4, "programmer");

		Integer[] i = map.keySet().toArray(new Integer[0]);
		String[] s = map.values().toArray(new String[0]);

		System.out.println(Arrays.toString(i));
		System.out.println(Arrays.toString(s));
	}

}

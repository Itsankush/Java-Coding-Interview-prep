package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(2);
		list.add(11);
		list.add(3);
		list.add(10);
		// Convert list to set
		Set<Integer> set = new HashSet<>(list);

	}
}

package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_swap {

	public static void main(String[] args) {
		Set<String> Set = new HashSet<String>();

		// Adding some Elements
		Set.add("Java");
		Set.add("Python");
		Set.add("DBMS");
		Set.add("Machine Learning");
		Set.add("Operating System");
		// does not maintain order of insertion
		int n = Set.size();
		List<String> aList = new ArrayList<String>(n);
		for (String x : Set)
			aList.add(x);

		System.out.println(aList);
		// swap using Collections
		Collections.swap(aList, 0, 1);

		System.out.println(aList);
	}

}

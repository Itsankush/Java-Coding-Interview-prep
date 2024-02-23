package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sorting {

	static void sortUsingList() {
		// Sorting of set is not possible because it does not keep elements in order.
		Set<String> set = new HashSet<String>();
		set.add("Zebra");
		set.add("Lemon");
		set.add("Ankush");
		set.add("Aarti");

		System.out.println("Original: " + set);
		// Sorting HashSet using List
		ArrayList<String> list = new ArrayList<String>(set);
		Collections.sort(list);

		// Print the sorted elements of the HashSet
		System.out.println("Sorted: " + list);

	}

	static void sortUsingTreeset() {
		// Sorting of set is not possible because it does not keep elements in order.
		Set<String> set = new HashSet<String>();
		set.add("Zebra");
		set.add("Lemon");
		set.add("Ankush");
		set.add("Aarti");

		System.out.println("Original: " + set);
		// Sorting HashSet using List
		TreeSet<String> list = new TreeSet<String>(set);

		// Print the sorted elements of the HashSet
		System.out.println("Sorted: " + list);

	}

	public static void main(String[] args) {
		sortUsingList();
		sortUsingTreeset();
	}

}

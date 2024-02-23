package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_AllMethods {
	// Add all from another Set to current set
	static void add_All(Set<String> f, Set<String> s) {
		s.addAll(f);
		System.out.println(f);
		System.out.println(s);
	}

	// This method removes the specified element from the set if it is present.
	static void remove(Set<String> f) {
		f.remove("Lemon");
		System.out.println(f);
	}

	// This method returns true if the set contains the specified element,
	// otherwise returns false.
	static void contains(Set<String> s) {

		System.out.println(s.contains("Summer"));
	}

	// This method returns an Iterator object that can be used to iterate over the
	// elements in the set.
	static void iterate(Set<String> f) {
		Iterator<String> i = f.iterator();
		while (i.hasNext()) {
			String name = i.next();
			System.out.println(name);
		}

	}

	public static void main(String[] args) {
		Set<String> fruits = new HashSet<>();
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Lemon");
		Set<String> season = new HashSet<>();
		season.add("Summer");
		season.add("Winter");

		add_All(fruits, season);
		remove(fruits);
		contains(season);
		iterate(fruits);

	}

}

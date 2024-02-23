package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;

public class Overview_Of_Collection {
	static void arrayListCheck() {
		// multiple null & duplicates allowed 
		// follows order of insertion
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(null);
		al.add(null);
		al.add(1);
		al.add(3);
		al.add(null);
		al.add(2);
		System.out.println("ArrayList:- " + al);
	}

	static void hashSetCheck() {
		// only one null & no duplicate
		// does not maintain order of insertion
		HashSet<Integer> al = new HashSet<Integer>();
		al.add(null);
		al.add(null);
		al.add(-11);
		al.add(3);
		al.add(null);
		al.add(2);
		System.out.println("Hash Set:- " + al);

	}

	static void linkedHashSetCheck() {
		// only one null, no duplicates
		// follows order of insertion
		LinkedHashSet<Integer> al = new LinkedHashSet<Integer>();
		al.add(null);
		al.add(null);
		al.add(1);
		al.add(3);
		al.add(null);
		al.add(2);
		System.out.println("Linked Hash Set:- " + al);
	}

	static void hashMapCheck() {
		// multiple null values allowed, duplicate values allowed, duplicate keys not
		// allowed, one null key allowed
		// Does not follow order of insertion
		// High performance
		Map<Integer, String> al = new HashMap<Integer, String>();
		al.put(1, null);
		al.put(2, "dbc");
		al.put(7, null);
		al.put(2, "abc"); // here key is duplicate, so it will return new value always
		al.put(3, null);
		al.put(4, "xyz");
		al.put(5, "lmn");
		al.put(6, "lmn");
		al.put(null, "lmn");
		al.put(null, "ank");
		System.out.println("Hash Map:- " + al);
	}

	static void linkedHashMapCheck() {
		// multiple null allowed, duplicate values allowed, duplicate keys not allowed,
		// one null key allowed
		// follows order of insertion
		// Low performance
		Map<Integer, String> al = new LinkedHashMap<Integer, String>();
		al.put(1, null);
		al.put(2, "abc");
		al.put(7, null);
		al.put(2, "sbc");
		al.put(3, null);
		al.put(4, "xyz");
		al.put(5, "lmn");
		al.put(6, "lmn");
		al.put(null, "lmn");
		al.put(null, "ank");
		System.out.println("Linked Hash Map:- " + al);
	}

	static void treeMapCheck() {
		// multiple null values allowed, duplicate values allowed, duplicate keys not allowed
		// Keys will be in sorted order
		Map<Integer, String> al = new TreeMap<Integer, String>();
		al.put(1, null);
		al.put(7, null);
		al.put(2, "abc");
		al.put(2, "abc");
		al.put(3, null);
		al.put(4, "xyz");
		al.put(5, "lmn");
		al.put(6, "lmn");
		System.out.println("Tree Map:- " + al);
	}

	public static void main(String[] args) {

		arrayListCheck();
		hashSetCheck();
		linkedHashSetCheck();
		hashMapCheck();
		linkedHashMapCheck();
		treeMapCheck();
	}

}

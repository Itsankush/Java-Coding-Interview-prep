package collections;

import java.util.HashSet;

public class HashSet_dup_element {

	public static void duplicateWord(String[] str) {
		int c = 0;
		HashSet<String> set = new HashSet<String>();
		for (String s : str) {
			if (!set.add(s)) {
				c++;
				// System.out.println("Duplicate:- " + s);
			}
			if (c > 1) {
				System.out.println("Duplicate:- " + s);
			}
		}
	}

	public static void duplicateInt(int[] b) {
		int c = 0;
		HashSet<Integer> set = new HashSet<Integer>();
		for (int s : b) {
			c = 1;
			if (!set.add(s)) {
				c++;
				// System.out.println("Duplicate:- " + s);
			}
			if (c > 1) {
				System.out.println("Duplicate:- " + s);
				// c = 0;
			}

		}
	}

	public static void main(String[] args) {
		String a = "abc xyz hii klm alm hii xyz abc hii";
		String[] str = a.split(" ");
		int[] b = { 9, 1, 0, 4, 6, 0, 1, 7, 9, 4 };
		duplicateWord(str);
		duplicateInt(b);
	}

}

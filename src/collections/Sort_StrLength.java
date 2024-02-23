package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//sort strings based on the length of strings
public class Sort_StrLength {

	static void usingList() {
		List<String> list = Arrays.asList("ankush", "sam", "make", "if", "a", "hi");
		Collections.sort(list, Comparator.comparingInt(String::length));
		for (String n : list)
			System.out.print(n + " ");
		System.out.println();
	}

	static void usingComparator(String[] s) {
		Arrays.sort(s, Comparator.comparing(n -> n.length()));

		for (int i = 0; i < s.length; i++)
			System.out.print(s[i] + " ");
	}

	public static void main(String[] args) {

		String[] s = { "ankush", "sam", "make", "if", "a", "hi" };
		usingList();
		usingComparator(s);
	}
}

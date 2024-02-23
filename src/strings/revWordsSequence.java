package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class revWordsSequence {

	static String reverseString(String s1) {
		String[] a = s1.split(" ");
		int i = a.length;
		while (i > 0) {
			System.out.print(a[i - 1] + " ");
			i--;
		}
		return s1;

	}

	static void usingList(String s1) {
		List<String> list = new ArrayList<>(Arrays.asList(s1));
		Collections.reverse(list);
		System.out.println(list);
//		for (int i = list.size(); i < 0; i--) {
//			System.out.println(list);
//		}

	}

	public static void main(String[] args) {
		String s1 = "go2d not but , fine am I";
		// reverseString(s1);
		reverseString(s1);
	}

}

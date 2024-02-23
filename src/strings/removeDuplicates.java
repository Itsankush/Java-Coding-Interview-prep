package strings;

import java.util.LinkedHashSet;

public class removeDuplicates {

	static void remove(String a) {
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < a.length(); i++)
			set.add(a.charAt(i));

		for (Character ch : set)
			System.out.print(ch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ankushpopatfartale";
		remove(str);
	}

}

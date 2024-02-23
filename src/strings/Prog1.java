package strings;

import java.util.Arrays;

//return addition of string length
//Compare lexicographically 2 strings return Yes is A is greater than B else No
//Capital 1st char of word and combine 2 strings with space
public class Prog1 {

	static void caps(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (i == 0) {
				System.out.print(Character.toUpperCase(s.toString().charAt(i)));
			} else
				System.out.print(s.charAt(i));
		}
		System.out.print(" ");
	}

	public static void main(String[] args) {

		String a = "hello";
		String b = "java";

		System.out.println(a.length() + b.length());
		String[] str = { a, b };
		Arrays.sort(str);
		if (str[0] == a) {
			System.out.println("No");
		} else
			System.out.println("Yes");
		caps(a);
		caps(b);
	}

}

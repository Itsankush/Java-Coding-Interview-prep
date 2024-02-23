package strings;

import java.util.Arrays;

public class Compare_2_Str {
	public static void compareString(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if (str1.length() != str2.length()) {
			System.out.println("String are not similar");
		} else {
			char[] string1 = str1.toCharArray();
			char[] string2 = str2.toCharArray();

			Arrays.sort(string1);
			Arrays.sort(string2);
			if (Arrays.equals(string1, string2) == true) {
				System.out.println("Strings are equal");
			} else {
				System.out.println("Strings are NOT equal");
			}
		}
	}

	public static void main(String[] args) {
		String str1 = "Grab";
		String str2 = "Barg";
		compareString(str1, str2);
	}
}

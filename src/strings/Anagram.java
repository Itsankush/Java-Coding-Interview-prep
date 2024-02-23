package strings;

import java.util.Arrays;

// compare 2 different words. 
public class Anagram {

	public static void main(String[] args) {
		String s1 = "conversation";
		String s2 = "voices rant on";
//		s2 = s2.replaceAll("\\s+", "");
		System.out.println(s1);
		System.out.println(s2);
		boolean isAnagram = false;

		if (s1.length() == s2.length()) {
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();

			Arrays.sort(c1);
			Arrays.sort(c2);
			isAnagram = Arrays.equals(c1, c2);
		}
		System.out.println("Both Strings are Anagram? " + isAnagram);
	}

}

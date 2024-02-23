package strings;

// Here we are not using Arrays class
public class Anagram_otherWay {

	public static boolean areAnagrams(String str1, String str2) {
		// Check if the lengths of both strings are equal
		if (str1.length() != str2.length()) {
			return false;
		}

		// Convert both strings to lowercase
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		// Check if both strings contain the same characters with the same frequencies
		for (int i = 0; i < str1.length(); i++) {
			char currentChar = str1.charAt(i);

			// Count occurrences in str1
			int countInStr1 = countOccurrences(currentChar, str1);

			// Count occurrences in str2
			int countInStr2 = countOccurrences(currentChar, str2);

			// Compare counts
			if (countInStr1 != countInStr2) {
				return false;
			}
		}

		// If all characters have the same frequencies, the strings are anagrams
		return true;
	}

	private static int countOccurrences(char targetChar, String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == targetChar) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// Test the function
		String str1 = "Hello";
		String str2 = "hello";

		if (areAnagrams(str1, str2)) {
			System.out.println("Anagrams");
		} else {
			System.out.println("Not Anagrams");
		}
	}
}

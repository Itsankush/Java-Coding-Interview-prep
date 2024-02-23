package strings;

public class String_rev {
	// Using for loop
	static void using_For(String str) {
		for (int i = str.length(); i > 0; i--) {
			System.out.print(str.charAt(i - 1));
		}
	}

	// Using While loop
	public static String using_While(String str) {
		int i = str.length();
		while (i > 0) {
			System.out.print(str.charAt(i - 1));
			i--;
		}
		return str;

	}

	// Palindrome
	public static boolean Palindrome(String str) {
		int i = str.length();
		String rev = "";
		while (i > 0) {
			rev = rev + str.charAt(i - 1);
			i--;
		}
		if (str.equals(rev))

			return true;
		return false;

	}

	public static void main(String[] args) {
		String str = "mom dady";
		using_For(str);
		System.out.println();
		using_While(str);
		System.out.println();
		if (Palindrome(str)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is NOT palindrome");
		}

	}

}

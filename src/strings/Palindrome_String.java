package strings;

public class Palindrome_String {

	public static void main(String[] args) {
		String str = "noon";
		int i = str.length();
		String rev = "";
		while (i > 0) {
			rev = rev + str.charAt(i - 1);
			i--;
		}
		if (str.equals(rev)) {
			System.out.println("Palindrome");
		} else
			System.out.println("Not Palindrome");
	}

}

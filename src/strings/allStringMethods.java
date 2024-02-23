package strings;

public class allStringMethods {
	static void Concat(String a, String b) {
		System.out.println(a.concat(b)); // connect 2 strings
	}

	static void equalsIgnoreCase(String a, String b) {
		System.out.println(a.equalsIgnoreCase(b)); // compare by ignoring case
	}

	static void indexOf(String a) {
		System.out.println(a.indexOf("Ankush")); // find position of
	}

	static void trim() {
		String a = "   A n k u s h";
		System.out.println(a.trim()); // remove preceding and ending spaces
	}

	static void split() {
		String a = "A n k u s h";
		String[] str = a.split("k"); // Divide string in two parts {A n} {u s h}
		System.out.println(str[0].trim());
		System.out.println(str[1].trim());
	}

	static void charToString() {
		char[] ch = { 'j', 'a', 'v', 'a', 't', 'p', 'o', 'i', 'n', 't' };
		String s = new String(ch);
		System.out.println(s); // remove spaces preceding and ending spaces
	}

	static void contains() {
		String str = "ankushsmashmarsh";
		System.out.println(str.contains("sh")); // Returns true if this string contains the specified sequence of
												// characters.
	}

	static void removeSpaces() {
		String str = "ankush smash marsh";
		String newstr = str.replaceAll("\\s", "");
		System.out.println(newstr); // Returns true if this string contains the specified sequence of
									// characters.
	}

	public static void main(String[] args) {
		String a = "Ankush", b = "ankush";
		System.out.println(a.contains("Hi"));
		Concat(a, b);
		equalsIgnoreCase(a, b);
		indexOf(a);
		trim();
		split();
		charToString();
		contains();
		removeSpaces();
	}

}

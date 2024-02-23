package strings;

public class Count_Substring {
	// substring with one char like "l"
	public static void main(String[] args) {
		String str = "hello cell cello";
		String c = "e";

		int count = str.length() - str.replace(c, "").length();
		System.out.println(str.length());
		System.out.println(str.replace(c, "").length());
		System.out.println(count);
	}

}

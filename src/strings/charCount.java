package strings;

public class charCount {
	public void findCount(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public void findPunctuation(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		charCount c = new charCount();
		String str = "ankushfartale";
		c.findCount(str);
		c.findPunctuation(str);
		int i=str.length();
		System.out.println(i);
	}

}

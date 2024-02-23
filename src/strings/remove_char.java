package strings;

public class remove_char {

	public static void main(String[] args) {
		String str = "Ankush Fartale";
		String s = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 'a' && str.charAt(i) != 'A' && str.charAt(i) != ' ') {
				s = s + str.charAt(i);
			}
		}
		System.out.println(s);
	}

}

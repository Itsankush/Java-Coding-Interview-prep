package strings;

public class replace_end_of_word {
//replace end of each word and capitalize all words
	public static void main(String[] args) {
		String str = "Satyam Shivam Sundaram";

		String[] arr = str.split(" ");

		for (String st : arr) {
			StringBuilder s = new StringBuilder(st);
			s.setCharAt(s.length() - 1, '$');
			System.out.print(s.toString().toUpperCase() + " ");
		}
		System.out.println();
		for (String ss : arr) {
			String newstr = ss.toUpperCase().substring(0, ss.length() - 1);
			System.out.print(newstr + '$' + " ");

		}

	}

}

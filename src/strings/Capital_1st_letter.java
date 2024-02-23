package strings;

public class Capital_1st_letter {

	public static void main(String[] args) {
		String a = "ankush fartale";

		String[] s = a.split(" ");
		for (String ss : s) {
			char temp = ss.toUpperCase().charAt(0);
			String res = ss.substring(1, ss.length());

			System.out.print(temp + res + " ");
		}
	}

}

package strings;

public class Rev_Str_removeSpace {

	public static void main(String[] args) {
		String a = "ankush fartale";

		char[] c = a.toCharArray();

		for (int i = c.length - 1; i >= 0; i--) {
			if (c[i] != ' ') {
				System.out.print(c[i]);
			}

		}

	}

}

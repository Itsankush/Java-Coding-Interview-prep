package strings;

public class countOfDuplicateChar {

	public static void main(String[] args) {
		// count duplicate characters in given string
		String name = "antkushfartale";
		int k = 0;
		char[] str = name.toCharArray();

		for (int i = 0; i < str.length; i++) {
			k = 1;
			for (int j = i + 1; j < str.length; j++) {

				if (str[i] == str[j]) {
					k++;
				}
			}
			if (k > 1) {
				System.out.println(str[i]);
			}
		}
		k = 0;
	}
}

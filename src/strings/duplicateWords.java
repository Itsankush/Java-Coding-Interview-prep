package strings;

public class duplicateWords {

	public static void main(String[] args) {
		int c = 0;
		String a = "abc jkn abc hii abc hii";
		String[] str = a.split(" ");
		int b = str.length;
		for (int i = 0; i < b; i++) {
			for (int j = i + 1; j < b; j++) {
				if (str[i].equals(str[j])) {
					c++;
				}
			}
			if (c > 1) {
				System.out.println(str[i] + ":" + c);
				c = 0;
			}

		}
	}

}

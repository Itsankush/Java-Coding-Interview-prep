package strings;

public class compare_2_Str_word {
	public static void main(String[] args) {
		String st1 = "Ankush Popat Fartale vaibhaV arati";
		String st2 = "Arati Ankush Fartale Vaibhav";
		int c = 0;
		String[] s1 = st1.split(" ");
		String[] s2 = st2.split(" ");

		for (String str1 : s1) {
			c = 1;
			for (String str2 : s2) {
				if (str1.equalsIgnoreCase(str2)) {
					c++;
				}
			}
			if (c > 0)
				System.out.println(str1 + " : " + c);
		}
		c = 0;
	}
}

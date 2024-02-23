package strings;

public class Count_SubStr {

	public static void main(String[] args) {
		String s = "Hello cello cell";
		String[] str = s.split(" ");
		String substr = "ll";
		int count = 0;
		
		if (substr.length() > 1) {
			// substring more than 1 char like "ell"
			for (String s1 : str) {

				if (s1.indexOf(substr) != -1) {
					count++;
				} else {
					System.out.println("SubString not present");
				}
			}
		} else {
			// substring with one char like "l"
			count = s.length() - s.replace(substr, "").length();
		}
		System.out.println("Substring presnet " + count + " times");
	}

}

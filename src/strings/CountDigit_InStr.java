package strings;

// Find out whether string contains how many numeric values & alphabates
public class CountDigit_InStr {

	public static void main(String[] args) {
		String a = "23456t";
		char[] c = a.toCharArray();
		int k = 0;
		int len = a.length();
		for (int i = 0; i < c.length; i++) {
			if (Character.isDigit(c[i])) {
				k++;
			}

		}
		if (len == k) {
			System.out.println("All numeric values present");
		} else if (len - k == 1)
			System.out.println(len - k + " alphabate is present");
		else
			System.out.println(len - k + " alphabates are present");
	}

}

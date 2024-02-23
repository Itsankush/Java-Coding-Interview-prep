package strings;

public class upper_lower_convert {

	public static void main(String[] args) {
		String str = "Arati Ankush Arati Ankush";
		int mid = str.length() / 2;
		String lower = "";
		String upper = "";
		for (int i = 0; i < str.length(); i++) {
			if (i < mid) {
				lower = lower + str.charAt(i);
			} else {
				upper = upper + str.charAt(i);
			}
		}
		System.out.println(lower.toLowerCase() + upper.toUpperCase());
	}

}

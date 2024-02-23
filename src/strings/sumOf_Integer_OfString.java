package strings;

// find the sum of integer from string
public class sumOf_Integer_OfString {

	public static void main(String[] args) {
		String a = "A1B2C3D4";
		int sum = 0;
		char[] c = a.toCharArray();

		for (int i = 0; i < c.length; i++) {
			if (Character.isDigit(c[i])) {
				sum = sum + Character.getNumericValue(c[i]);
			}
		}
		System.out.println(sum);

	}

}

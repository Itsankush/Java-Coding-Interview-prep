package strings;

public class odd_even_position_letters {
	// return odd/even positioned character as 2 different string
	public static void main(String[] args) {
		String even = "", odd = "";
		String str = "abcdefghijklmnopqrstuvwxyz";
		char[] a = str.toCharArray();

		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				even = even + a[i];
			} else {
				odd = odd + a[i];
			}
		}
		System.out.println("Even: " + even);
		System.out.println("Odd: " + odd);
	}
}

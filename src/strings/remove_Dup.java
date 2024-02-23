package strings;

public class remove_Dup {

	public static void main(String[] args) {
		String a = "aautttooommaatiiioonnn";
		String b = "";

		char prev = a.charAt(0);
		b = b + prev;

		for (int i = 1; i < a.length(); i++) {
			char curr = a.charAt(i);
			if (prev != curr) {
				b = b + curr;
				prev = curr;
			}
		}
		System.out.print(b);

	}

}

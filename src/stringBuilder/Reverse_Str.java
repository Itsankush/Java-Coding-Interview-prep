package stringBuilder;

public class Reverse_Str {

	public static void main(String[] args) {
		String str = "Hello";
		String output = new StringBuilder(str).reverse().toString();
		System.out.println(output);
	}

}

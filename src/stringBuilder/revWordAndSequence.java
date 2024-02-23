package stringBuilder;

public class revWordAndSequence {

	public static void main(String[] args) {
		String s1 = "doog ma I"; // output:- I am good
		String[] a = s1.split(" ");

		String reverseWord = "";
		for (String w : a) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseWord += sb.toString() + " ";

		}
		// all words are reversed now
		System.out.println(reverseWord);
		
		// converting String to Array of String
		String[] b = reverseWord.split(" ");
		int i = b.length;
		// 2 ways to print output: I am good
		// using for loop
		for (int j = (b.length - 1); j >= 0; j--) {
			System.out.print(b[j] + " ");
		}
		// using while loop
		while (i > 0) {
			System.out.print(b[i - 1] + " ");
			i--;
		}

	}

}

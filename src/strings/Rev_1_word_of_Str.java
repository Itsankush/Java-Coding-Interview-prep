package strings;

import java.util.Scanner;

//There is one word which is reverse in string
//Reverse that word only and print whole string

public class Rev_1_word_of_Str {
	public static void main(String[] args) {
		String str = "Ankush tapoP Fartale";
		String[] s = str.split(" ");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter index of word which you want to reverse: ");
		int index = sc.nextInt();

		int i = s[index].length();
		System.out.print(s[0] + " ");
		while (i > 0) {
			System.out.print(s[index].charAt(i - 1));
			i--;
		}

		System.out.print(" " + s[2]);
//		for (int j = index + 1; j < s.length; j++) {
//			System.out.print(" " + s[j]);
//		}
	}

}

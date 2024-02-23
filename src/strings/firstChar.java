package strings;

public class firstChar {

	public static void main(String[] args) {
		String a = "ankush popat fartale";
		// output:- apf

		String[] str = a.split(" ");

		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i].charAt(0));
		}
	}

}

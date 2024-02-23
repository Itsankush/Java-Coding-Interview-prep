package strings;

//input: dab ro do2g gnile2f osla uoy era do2g gnile2f ma I
//output: I am feeling good are you also feeling good or bad
public class Rev_str_and_words {

	public static void main(String[] args) {
		String str = "dab ro do2g gnile2f osla uoy era do2g gnile2f ma I";
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == '2') {
				System.out.print(str.charAt(i - 1));
			} else
				System.out.print(str.charAt(i));
		}
	}

}

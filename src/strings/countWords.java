package strings;

public class countWords {

	private void wordCount(String a) {
		String[] str = a.split(" ");
		System.out.println(str.length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countWords c = new countWords();
		String a = "Mr Ankush Popat Fartale";
		c.wordCount(a);
	}

}

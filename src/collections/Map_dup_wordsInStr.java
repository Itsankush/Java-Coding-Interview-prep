package collections;

import java.util.HashMap;
import java.util.Map;

public class Map_dup_wordsInStr {

	public static void main(String[] args) {
		String[] bookList = { "Ram", "Laxman", "Sita", "Ravan", "Shiva", "Krishna", "Ravan", "Ram", "Sita" };
		HashMap<String, Integer> book = new HashMap<String, Integer>();

		for (String s : bookList) {

			if (book.containsKey(s)) {
				book.put(s, book.get(s) + 1);
			} else {
				book.put(s, 1);
			}

		}
		System.out.println(book);
		System.out.println("Books with more than 1 count");
		for (Map.Entry<String, Integer> m : book.entrySet()) {
			if (m.getValue() > 1) {
				System.out.println(m.getValue() + ":" + m.getKey());
			}
		}
	}

}

package collections;

import java.util.ArrayList;
import java.util.List;

public class Occurance_of_0s {

	public static void main(String[] args) {
		String binary = "1001";
		int num = 0;

		List<Integer> l = new ArrayList<>();

		for (char c : binary.toCharArray()) {
			l.add(Character.getNumericValue(c));
		}
		System.out.println("list: " + l);
		System.out.println("list size: " + l.size());
		int old_size = l.size();
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i).equals(1)) {
				l.add(i);
			}
		}
		System.out.println("new list: " + l);

		System.out.println("new size: " + l.size());
		int flag = 0;
		for (int i = old_size; i < l.size() - 1; i++) {
			num = l.get(i + 1) - l.get(i) - 1;
			if (num > 0) {
				flag++;
			}
		}
		System.out.println("------------------------------");
		System.out.println("Total occurances of 0's are: " + flag);
		System.out.println("------------------------------");

	}

}

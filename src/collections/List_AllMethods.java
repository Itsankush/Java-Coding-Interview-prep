package collections;

import java.util.ArrayList;
import java.util.List;

public class List_AllMethods {

	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<>();
		list.add('b');
		list.add(0, 'a');
		list.add(0, 'a');
		list.add('d');
		list.add(2, 'c');
		System.out.println(list.get(1));
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		System.out.println(list.get(0));
		list.set(1, 'z');
		System.out.println(list);
		System.out.println(list.subList(1, 2));
	}
}

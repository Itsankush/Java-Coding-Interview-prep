package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class iteratorTypes {

	static void iterator(ArrayList<Integer> l) {
		Iterator<Integer> i = l.iterator();
		while (i.hasNext()) {
			int next = i.next();
			System.out.print(next + " ");
		}
	}

	static void ListIterator_forward(ArrayList<Integer> l) {
		ListIterator<Integer> i = l.listIterator();
		while (i.hasNext()) {
			int next = i.next();
			System.out.print(next + " ");
		}
	}

	static void ListIterator_backward(ArrayList<Integer> l) {

		ListIterator<Integer> i = l.listIterator();
		while (i.hasPrevious()) {
			System.out.println(i.previous());
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(1);
		// function call
		iterator(list);
		System.out.println();
		ListIterator_forward(list);
		System.out.println();
		ListIterator_backward(list);

	}

}

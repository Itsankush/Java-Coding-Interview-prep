package collections;

import java.util.LinkedList;
import java.util.Scanner;

public class linkedL_nthElement {

	static void middleElement(LinkedList<Integer> L) {
		int n = L.size() / 2;
		System.out.println("middle element index:- " + n + ", List size:- " + L.size());
		if (n % 2 == 0) {
			System.out.println("Middle element:- " + L.get(n));
		} else
			System.out.println("Middle element:- " + L.get(n));
	}

	static void nthElement(LinkedList<Integer> L) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter index");
			int n = in.nextInt();
			try {
				if (n <= L.size()) {
					System.out.println("n-th Element:- " + L.get(n));
				}
			} catch (Exception exp) {
				System.out.println("index out of bound");
			}
		}
	}

	public static void main(String[] args) {
		LinkedList<Integer> L = new LinkedList<Integer>();
		L.add(1);
		L.add(2);
		L.add(3);
		L.add(4);
		L.add(5);
		L.add(6);
		L.add(7);
		L.add(8);
		L.add(9);
		L.add(10);
		// System.out.println(L.size());
		middleElement(L);
		nthElement(L);

	}

}

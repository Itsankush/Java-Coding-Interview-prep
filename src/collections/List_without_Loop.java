package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class List_without_Loop {
	// find value in list of elements without using loops
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:-");
		int num = sc.nextInt();

		// check if number present in list or not
		if (list.contains(num)) {
			// Code for position
			if (list.indexOf(num) == 1) {
				System.out.println("Present at " + list.indexOf(num) + "st position.");
			} else if (list.indexOf(num) == 2) {
				System.out.println("Present at " + list.indexOf(num) + "nd position.");
			} else if (list.indexOf(num) == 3) {
				System.out.println("Present at " + list.indexOf(num) + "rd position.");
			} else {
				System.out.println("Present at " + list.indexOf(num) + "th position.");
			}
		} else
			System.out.println("Not Present");
	}
}

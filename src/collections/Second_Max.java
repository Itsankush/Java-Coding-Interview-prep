package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Second_Max {

	static void Largest_List(List<Integer> list) {

		int max1 = list.get(0);
		int max2 = list.get(1);

		for (int num : list) {
			if (num > max1) {
				max2 = max1;
				max1 = num;
			} else if (num > max2 && num != max1) {
				max2 = num;
			}
		}
		System.out.println("The 2nd maximum number is: " + max2);
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(2);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.get(3)); // 2nd max element
		// Largest_List(list);
	}

}

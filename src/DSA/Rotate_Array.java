package DSA;

import java.util.*;

public class Rotate_Array {

	public static void main(String[] args) {

		int r = 2;
		int temp;
		int a = 0;

		List<Integer> l = new ArrayList<>();
		for (int i = 1; i < 5; i++) {
			l.add(i);
		}

		int size = l.size();

		while (r > 0) {
			a = size - 1;
			temp = l.get(a);
			l.remove(a);
			int index = 0;
			l.add(index, temp);
			index++;
			r--;
		}
		System.out.println(l);
	}
}

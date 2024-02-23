package collections;

//1 2 3 4 if r = 1 then o/p: 4 1 2 3
// 1 2 3 4 if r = 2 then o/p: 3 4 1 2
//1 2 3 4 if r = 3 then o/p: 2 3 4 1
import java.util.ArrayList;
import java.util.List;

public class Rotate_List {

	public static void main(String[] args) {
		int r = 3; // 1 2 3 4 5
		int temp;
		int a = 0;

		List<Integer> l = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			l.add(i);
		}

		int size = l.size();
		System.out.println(l);
		System.out.println();

		while (r > 0) {
			a = size - 1;
			temp = l.get(a); // 9
			l.remove(a);
			int index = 0;
			l.add(index, temp);
			index++;
			r--;
		}
		System.out.println(l);
	}
}

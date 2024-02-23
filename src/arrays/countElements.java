package arrays;

public class countElements {

	static void countElement_1(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println("unique:- " + a[i]);
			} else if (count > 1) {
				System.out.println(a[i] + " repeated " + count + " times");
				count = 0;
			}
		}
	}

	public static void main(String[] args) {

		int[] a = { 1, 3, 6, 2, 4, 1, 2 };
		countElement_1(a);
	}

}

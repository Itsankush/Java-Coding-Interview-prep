package arrays;

public class splitArray {

	public static void main(String[] args) {

		int[] a1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int size = a1.length - 1 / 2;
		int[] a2 = new int[size];
		int[] a3 = new int[size];

		for (int i = 0; i < a1.length; i++) {
			if (a1[i] % 2 == 0) {
				a2[i] = a1[i];
			} else
				a3[i] = a1[i];
		}
		for (int i = 0; i < a2.length; i++) {
			if (!(a2[i] == 0)) {
				System.out.print(a2[i] + " ");
			}
		}
		System.out.println();
		for (int i = 0; i < a3.length; i++) {
			if (!(a3[i] == 0)) {
				System.out.print(a3[i] + " ");
			}
		}
	}

}

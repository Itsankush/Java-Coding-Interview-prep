package arrays;

public class odd_even {

	public static void even(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.print(a[i] + " ");
			}
		}
	}

	public static void odd(int a[]) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.print(a[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		// separate odd and even numbers in array
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.print("Even:- ");
		even(a);
		System.out.println();
		System.out.print("Odd:- ");
		odd(a);
	}
}

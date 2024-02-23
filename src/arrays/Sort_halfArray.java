package arrays;

//i/p: 2 0 3 0 4 0 1 0
//o/p: 0 0 0 0 4 3 2 1
import java.util.Arrays;

public class Sort_halfArray {

	public static void main(String[] args) {
		int[] a = { 2, 0, 3, 0, 4, 0, 1, 0 };
		int[] b = new int[a.length];
		int[] c = new int[a.length];
		int j = 4;

		Arrays.sort(a);

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				b[i] = a[i];
			} else
				c[i] = a[i];
		}
		Arrays.sort(c);
		for (int i = 0; i < 4; i++) {
			a[i] = b[i];
		}
		for (int i = 7; i > 3; i--) {
			a[a.length - j] = c[i];
			j--;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}

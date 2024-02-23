package sort;

import java.util.Arrays;
import java.util.List;

public class reorderArray {

	public static void main(String[] args) {
		// input: { 0, 1, 0, 1, 0, 1, 0, 1 }
		// output: { 1, 1, 1, 1, 0, 0, 0, 0 }
		int[] arr = { 0, 1, 0, 1, 0, 1, 0, 1 };
		int a = arr.length - 1;
		Arrays.sort(arr);
		for (int i = a; i >= 0; i--)
			System.out.print(arr[i] + " ");
	}

}

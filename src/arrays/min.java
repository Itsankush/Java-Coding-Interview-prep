package arrays;

import java.util.Arrays;

public class min {

	public static void main(String[] args) {
		int[] a = { 10, 4, 3, 2, 12, 5, 6, 7, 8, 9 };
		//int min = a[0];
		int min = Integer.MAX_VALUE; // i.e. largest value 
		System.out.println(Arrays.toString(a));
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(min);
	}

}

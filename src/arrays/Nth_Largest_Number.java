package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Nth_Largest_Number {

	public static void large_Nth(int[] a, int n) {
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println(a[n]);
	}
	
	

	public static void main(String[] args) {
		int[] a = { 2, 1, 4, 6, 3, 8, 31, 7 };
		int n = a.length - 5; // Nth value 8-5=3rd element will shown
		large_Nth(a, n);
		Arrays.sort(a); // Sorted array:-1, 2, 3, 4, 6, 7, 8, 31
		System.out.println(Arrays.toString(a));
		Scanner sc = new Scanner(System.in);
		int nth = sc.nextInt();
		int Nth_max = a.length - nth;
		System.out.println(a[Nth_max]);
	}

}

package arrays;

import java.util.Arrays;

//WAP to find 3 numbers from given array whose sum is equal to X.
public class findNums_sum_X {

	public static void main(String[] args) {
		int a[] = { 1, 10, 2, 4, 3, 5, 6, 7, 8, 9 };
		int x = 9;
		int n = a.length;
		int flag = 0;
		Arrays.sort(a);
		
		
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (a[i] + a[j] + a[k] == x) {
						flag++;
						System.out.println(a[i] + " " + a[j] + " " + a[k]);
					}

				}
			}
		}
		if (flag == 0)
			System.out.println("Not found");
	}

}

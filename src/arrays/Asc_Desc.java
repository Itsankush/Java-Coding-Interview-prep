package arrays;

public class Asc_Desc {

	public static void ascending(int[] a, int temp) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 0; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int k = 0; k < a.length; k++)
			System.out.print(a[k]+" ");
	}

	public static void descending(int[] a, int temp) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int k = 0; k < a.length; k++)
			System.out.print(a[k]+" ");
	}

	public static void main(String[] args) {
		int[] arr= {100, 4, 60, 99, 101, 6, 1, 67};
		int constant=0;
ascending(arr, constant);
System.out.println();
descending(arr, constant);
	}

}

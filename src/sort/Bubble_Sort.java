package sort;

public class Bubble_Sort {

	static void Sort(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 70, 40, 100, 3, 50, 70, 30 };
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		Sort(a);
		System.out.println(" ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}

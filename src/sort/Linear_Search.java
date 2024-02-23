package sort;

public class Linear_Search {

	static void Search(int arr[], int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.println(i);
			}
		}

	}

	public static void main(String[] args) {
		int a[] = { 10, 40, 100, 5, 8, 50 };
		int key = 5;

		Search(a, key);
	}

}

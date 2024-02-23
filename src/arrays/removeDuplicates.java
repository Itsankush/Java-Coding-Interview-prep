package arrays;

public class removeDuplicates {

	public static void main(String[] args) {
		// Input array with duplicates
		int[] arr = { 3, 2, 1, 2, 3, 4, 5, 4, 6 };

		// Create a new array to store unique elements
		int[] uniqueArr = new int[arr.length];
		int index = 0;

		// Iterate through the input array and add unique elements to the new array
		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < index; j++) {
				if (arr[i] == uniqueArr[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				uniqueArr[index++] = arr[i];
			}
		}

		// Print the new array with duplicates removed
		System.out.print("Array with duplicates removed: ");
		for (int i = 0; i < index; i++) {
			System.out.print(uniqueArr[i] + " ");
		}

	}

}

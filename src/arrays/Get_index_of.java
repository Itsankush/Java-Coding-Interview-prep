package arrays;
//Get the index of given number from array
public class Get_index_of {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 6, 4, 8, 0 };
		int target = 10;
		int position = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				position = i;
				break;
			}
		}
		if (position != 0) {
			System.out.println("The index of " + target + " is " + position);
		} else {
			System.out.println(target + " was not found in the array");
		}
	}

}

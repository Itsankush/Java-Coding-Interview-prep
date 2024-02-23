package arrays;

public class Second_Max {

	static void Largest_Array(int[] list) {
		int max1 = list[0];
		int max2 = list[1];

		for (int num : list) {
			if (num > max1) {
				max2 = max1;
				max1 = num;
			} else if (num > max2 && num != max1) {
				max2 = num;
			}
		}
		System.out.println(max1 + " " + max2);
	}

	public static void main(String[] args) {
		int[] l = { 11, 14, 12, 3, 5, 7, 10 };

		Largest_Array(l);
	}

}

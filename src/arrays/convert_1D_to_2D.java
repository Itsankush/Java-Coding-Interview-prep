package arrays;

public class convert_1D_to_2D {
	static void convertTo2D(int a[]) {
		//System.out.println(a.length);
		int n = a.length / 3;
		// System.out.println(n);
		if (n == 0) {
			System.out.println("Not eligible for conversion");
		} else {

			int[][] b = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {

					b[i][j] = a[(i * n) + j];
					System.out.print(b[i][j] + " ");

				}
				System.out.println();
			}
		}
	}

	static void convertTo1D(int[][] a) {
		int n = a.length;

		int[] b = new int[a.length * a.length];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				b[(j * n) + i] = a[i][j];
				System.out.print(b[(j * n) + i] + " ");

			}
			//System.out.println();
		}

	}

	public static void main(String[] args) {
		int[] a = { 1, 3, 2, 4, 5, 7, 8, 9, 0};
//		1 3 2
//		4 5 7
//		8 9 0
		int[][] c = { { 11, 12, 3 }, { 14, 5, 16 }, { 17, 18, 9 } };
		convertTo2D(a);
		convertTo1D(c);
	}

}

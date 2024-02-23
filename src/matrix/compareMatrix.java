package matrix;

public class compareMatrix {
	static void compare(int[][] a, int[][] b) {
		int row1, col1, row2, col2;
		boolean flag = true;
		row1 = a.length;
		col1 = a[0].length;
		row2 = b.length;
		col2 = b[0].length;
		if (row1 != row2 || col1 != col2) {
			System.out.println("Matrices are not equal");
		} else {

			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b.length; j++) {
					if (a[i][j] != b[i][j]) {
						flag = false;
						break;
					}
				}
			}
			if (flag)
				System.out.println("Matrices are equal");
			else
				System.out.println("Matrices are not equal");
		}
	}

	public static void main(String[] args) {
		int a[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
		int b[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
		compare(a, b);
	}

}

package matrixproblems;

public class ZigZagMatrix {

	public static void main(String[] args) {

		int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		int row = 0, col = 0;
		// upper triangle
		for (int k = 0; k < mat.length; k++) {
			if (k % 2 == 0) {

				row = k;
				col = 0;
				while (row >= 0) {
					System.out.print(mat[row][col] + " ");

					row--;
					col++;
				}

			} else {
				row = 0;
				col = k;
				while (row <= k) {
					System.out.print(mat[row][col] + " ");
					row++;
					col--;
				}
			}
		}
		// lowwewr triangle
		for (int k = 1; k < mat[0].length; k++) {
			if (k % 2 != 0) {
				row = k;
				col = mat[0].length - 1;
				while (col >= k) {
					System.out.print(mat[row][col] + " ");
					row++;
					col--;
				}
			} else {
				row = mat[0].length - 1;
				col = k;
				while (col <= mat[0].length - 1) {
					System.out.print(mat[row][col]);
					row--;
					col++;
				}

			}
		}

	}

}

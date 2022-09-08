package matrixproblems;

public class SortMtrixDiagonally {

	public static void main(String[] args) {

		int a[][] = { { 5, 2, 3, 1 }, { 12, 1, 55, 9 }, { 23, 10, 99, 0 }, { 12, 9, 8, 21 } };

		// upper triangle
		int n = a.length;
		System.out.println(n);
		int m = a[0].length;
		System.out.println(m);
		int row = 0, col = 0;
		int arraySize = m;
		for (int i = 0; i <= m - 1; i++) {
			if (i == 0) {
				row = i;
				col = 0;
				int array[] = new int[m];
				int index = -1;
				while (row < m) {
					array[++index] = a[row][col];
					System.out.println("row,col" + row + " " + col);
					row++;
					col++;
				}
				index = -1;
				System.out.println("array before sorted");
				for (int k = 0; k < array.length; k++) {
					System.out.print(array[k] + " ");
				}
				array = array_sort(array);
				row = 0;
				col = 0;
				while (row < m) {
					a[row][col] = array[++index];
					row++;
					col++;

				}

				System.out.println("print matrix");
				matrixprint(a);
				System.out.println();
			} else {
				arraySize--;
				row = 0;
				col = i;
				int array[] = new int[arraySize];
				int index = -1;
				while (col < m) {
					array[++index] = a[row][col];
					System.out.println("row,col" + row + " " + col);
					col++;
					row++;
				}
				index = -1;
				System.out.println("array before sorted");
				for (int k = 0; k < array.length; k++) {
					System.out.print(array[k] + " ");
				}
				array = array_sort(array);
				row = 0;
				col = i;
				while (col < m) {
					a[row][col] = array[++index];
					col++;
					row++;

				}

				System.out.println("print matrix");
				matrixprint(a);
				System.out.println();
			}
		}
		// lower triangle
		arraySize = n;
		System.out.println("LOWER PART");
		for (int i = 1; i < n; i++) {

			if (n != m) {
				if (i == 1) {
					row = 1;
					col = 0;
					int array[] = new int[m];
					int index = -1;
					while (row < n) {
						array[++index] = a[row][col];
						System.out.println("row,col" + row + " " + col);
						row++;
						col++;
					}
					index = -1;
					System.out.println("array before sorted");
					for (int k = 0; k < array.length; k++) {
						System.out.print(array[k] + " ");
					}
					array = array_sort(array);
					row = i;
					col = 0;
					while (row < n) {
						a[row][col] = array[++index];
						row++;
						col++;

					}

					System.out.println("print matrix");
					matrixprint(a);
					System.out.println();

				} else {
					row = i;
					col = 0;
					int index = -1;
					int array[] = new int[arraySize - 2];
					while (row < n) {
						array[++index] = a[row][col];
						System.out.println("row,col" + row + " " + col);
						row++;
						col++;
					}
					index = -1;
					System.out.println("array before sorted");
					for (int k = 0; k < array.length; k++) {
						System.out.print(array[k] + " ");
					}
					array = array_sort(array);
					row = i;
					col = 0;
					while (row < n) {
						a[row][col] = array[++index];
						row++;
						col++;
					}
					arraySize--;
					System.out.println();
					System.out.println("print matrix");
					matrixprint(a);
					System.out.println();

				}
			} else {
				row = i;
				col = 0;
				int index = -1;
				int array[] = new int[arraySize - 1];
				while (row < n) {
					array[++index] = a[row][col];
					System.out.println("row,col" + row + " " + col);
					row++;
					col++;
				}
				index = -1;
				System.out.println("array before sorted");
				for (int k = 0; k < array.length; k++) {
					System.out.print(array[k] + " ");
				}
				array = array_sort(array);
				row = i;
				col = 0;
				while (row < n) {
					a[row][col] = array[++index];
					row++;
					col++;
				}
				arraySize--;
				System.out.println();
				System.out.println("print matrix");
				matrixprint(a);
				System.out.println();

			}
		}
	}

	private static void matrixprint(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static int[] array_sort(int[] array) {
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("print sorted array");
		printarray(array);
		return array;
	}

	private static void printarray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}

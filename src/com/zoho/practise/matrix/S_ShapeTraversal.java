package com.zoho.practise.matrixproblems;

public class S_ShapeTraversal {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }

		};

		printSShape(a);

	}

	private static void printSShape(int[][] a) {
		int j = 0;
		for (int i = 0; i < a.length; i++) {

			if (i % 2 == 0) {
				{
					while (j < a[0].length) {
						System.out.println(a[i][j]);
						j++;
					}
					j--;
				}
			} else {
				{
					while (j >= 0) {
						System.out.println(a[i][j]);
						j--;
					}
				}
			}

		}

	}

}

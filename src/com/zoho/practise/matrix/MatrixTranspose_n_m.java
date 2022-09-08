package com.zoho.practise.matrixproblems;

import java.util.Scanner;

public class MatrixTranspose_n_m {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the rows and columns");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();

		int a[][] = new int[r1][c1];
		a = getInout(a, r1, c1);
		int result[][] = new int[c1][r1];
		result = matrixTranspose(a, result);
		printmatrix(result);

	}

	private static void printmatrix(int[][] result) {
		System.out.println("resultant matrix");
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}

	}

	private static int[][] matrixTranspose(int[][] a, int[][] result) {

		for (int i = 0; i < a[0].length; i++) {//lengt of sol
			for (int j = 0; j < a.length; j++) {//length of row

				result[i][j] = a[j][i];
			}
		}

		return result;
	}

	private static int[][] getInout(int[][] a, int r1, int c1) {
		System.out.println("enter the ele");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		return a;
	}

}

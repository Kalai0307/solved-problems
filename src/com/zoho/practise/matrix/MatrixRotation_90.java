package com.zoho.practise.matrixproblems;

public class MatrixRotation_90 {

	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}

		matrixTranspose(a);
		swap(a);

	}

	private static void matrixTranspose(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a[0].length; j++) {
				if (i != j) {
					// a[i][j]=a[j][i];
					int temp = a[i][j];
					a[i][j] = a[j][i];
					a[j][i] = temp;
				}
			}
		}
		System.out.println("result by transpose");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}

	}
//clockwise
	private static void swap(int[][] a) {
		int n = a.length;
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[0].length / 2; j++) {
//				int k = n - j - 1;
//				// a[i][j]=a[j][i];
//				int temp = a[i][j];
//				a[i][j] = a[i][k];
//				a[i][k] = temp;
//
//			}
//		}
		//anticlockwise 
		for(int i=0;i<a.length/2;i++)
		{int k=n-1-i;
			for(int j=0;j<a[0].length;j++)
			{
			
					//a[i][j]=a[j][i];
					int temp=a[i][j];
					 a[i][j]=a[k][j];
					 a[k][j]=temp;				 
				
			}
		}
		System.out.println("result by swap");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}

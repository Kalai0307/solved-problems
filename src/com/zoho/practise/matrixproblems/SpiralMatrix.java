package com.zoho.practise.matrixproblems;

public class SpiralMatrix {

	public static void main(String[] args) {
		int  a[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
		spiralMatrix(a);

	}

	private static void spiralMatrix(int[][] a) {
	
		int r1=0,c1=0;
		int r2=a[0].length-1;
		int c2=a[0].length-1;
		while(c1!=c2 && r1!=r2)
		{
			for(int i=c1;i<=c2;i++)
			{
				System.out.print(a[r1][i]+" ");
			}
			r1++;
			for(int i=r1;i<=r2;i++)
			{
				System.out.print(a[i][c2]+" ");
			}
			c2--;
			for(int i=c2;i>=c1;i--)
			{
				System.out.print(a[r2][i]+" ");
			}
			r2--;
			for(int i=r2;i>=r1;i--)
			{
				System.out.print(a[i][c1]+" ");
			}
			c1++;
		}
		
	}

}

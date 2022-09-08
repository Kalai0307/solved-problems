package com.zoho.practise.matrixproblems;

public class MatrixTranspose {

	public static void main(String[] args) {
		
		int a[][]= {{1,2,3},
		{4,5,6},
		{7,8,9}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}

		matrixTranspose(a);
	}

	private static void matrixTranspose(int[][] a) {
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a[0].length;j++)
			{
				if(i!=j)
				{
					//a[i][j]=a[j][i];
					int temp=a[i][j];
					 a[i][j]=a[j][i];
					 a[j][i]=temp;				 
				}
			}
		}
		System.out.println("result");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
	}

}

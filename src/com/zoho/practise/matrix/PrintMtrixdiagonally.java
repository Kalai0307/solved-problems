package com.zoho.practise.matrixproblems;

public class PrintMtrixdiagonally {

	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }

		};
		int n = a.length;//first half part
		int m = a[0].length;
		for (int k = 0; k < n; k++) {
			int i = k;//start with 0
			int j = 0;
			while (i >= 0) {
				System.out.println(a[i][j]);
				i--;
				j++;
			}
		}
		for(int k =1;k<m;k++)//lower triangle
		{
			int i=n-1;//start with row-1
			int j=k;
			while(j<=m-1)
			
			{
				System.out.println(a[i][j]);
				i--;
				j++;
			}
		}

	}

}

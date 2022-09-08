package com.zoho.practise.matrixproblems;

public class MatAdd {

	public static void main(String[] args) {
		
		int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
		int b[][]={{1,3,4},{2,4,3},{1,2,4}};
		
		int c [][]= new int [3][3];
		 for(int i = 0; i < a.length; i++) {
	            for (int j = 0; j < b.length; j++) {
	                c[i][j] = a[i][j] + b[i][j];
	            }
	        }
		 
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=0;j<a.length;j++)
			 {
				 System.out.print(c[i][j]);
			 }
			 System.out.println();
		 }

	}

}

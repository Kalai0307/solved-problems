package com.zoho.test;
import java.lang.reflect.Array;
import java.util.Arrays;
//7.30=9.03
import java.util.Scanner;

//1.Find the longest increasing sub-sequence in Array.
//Input : {1,5,3,7}
//Output: {1,5,7} or {1,3,7}
//
//Input : {10,22,9,33,21,50,41}
//Output: {10,22,33,50}
public class LargestIncresingSubArray {

	public static void main(String[] args) {
		System.out.println("enter the array size");
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		System.out.println("enter the array elements");
		int array[] = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			array[i] = sc.nextInt();
		}	
		printArray(array);
	}
	private static void printArray(int[] array) {
		System.out.println("the result is ");
		int n = array.length;
		if (array.length == 1) {
			System.out.println(array[0]);
			return;
		}
		int max = 0;
		int index = 0;
		int val = 0;
		for (int i = 0; i < array.length - 1; i++) {
			int start = array[i];
			int count = 1;
			for (int j = i; j < array.length; j++) {
				if (start < array[j]) {
					count++;
					start=array[j];
				}
			}
			if (count > max) {
				max = count;
				index = i;
				val = array[i];
				
			}
		}
		System.out.println(val);
		System.out.println(Arrays.toString(array));
		for (int i = index; i < n; i++) {
			if (val < array[i]) {
				System.out.println(array[i]);
				val=array[i];
			}
		}
	}

}

package com.zoho.test;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int num = 0;
		int val = 0;
		for (int i = 1; i <= n; i++) {
			num = num + i;
			for (int j = 0; j < n - i; j++) {
				System.out.print(' ');
			}
			val = num;
			for (int k = 0; k < i; k++) {
				System.out.print(val--);
			}
			System.out.println();
		}
		val = val + n;
		for (int i = n - 1; i >= 0; i--) {
			for (int j = n - 1; j > i; j--) {
				System.out.print(' ');
			}
			for (int k = i; k >= 0; k--) {
				System.out.print(val--);
			}
			System.out.println();
		}
	}
}

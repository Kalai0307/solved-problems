package com.zoho.test;
import java.util.Scanner;
public class DictionaryWords {
//	Consider the following dictionary 
//	{ i, like, sam, sung, samsung, mobile, ice, 
//	  cream, icecream, man, go, mango}
//
//	Input:  ilike
//	Output: Yes 
//	The string can be segmented as "i like".
//
//	Input:  ilikesamsung
//	Output: Yes
//	The string can be segmented as "i like samsung" 
//	or "i like sam sung".
	public static void main(String[] args) {

		// String[] dictWords = { "i", "like", "sam","sung", "samsung", "milk", "ice",
		// "icecream", "man", "go", "mango" };
		Scanner sc = new Scanner(System.in);
		String[] dictWords = { "a", "aa", "bb", "bcd"};
		System.out.println("enter the string");
		String input = sc.nextLine();
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			boolean checking = false;
			String check = "";
			for (int j = i; j < input.length(); j++) {
				check = check + input.charAt(j);
				for (int k = 0; k < dictWords.length; k++) {
					if (check.equals(dictWords[k])) {
						count = count + check.length();
						i = j;
						checking = true;
					}
				}
				if (checking == true) {
					break;
				}
			}
		}
		if (count == input.length()) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

}

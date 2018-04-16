package codeChallenge;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {

		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String original, reverse = "";
		original = sc.next();
		int len = original.length();
		for(int i = len - 1; i >= 0; i-- ) {
			reverse = reverse+original.charAt(i);
		}
		if(original.equalsIgnoreCase(reverse)) {
			System.out.println("Plaindrome");
		}else
			System.out.println("Not a Palindrome");
		sc.close();
	}

}

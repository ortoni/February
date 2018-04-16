package codeChallenge;

import java.util.Scanner;

public class StrBuilderPalindrome {

	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		StringBuilder sb = new StringBuilder(input);
		sb.reverse();
		String dup = sb.toString(); 

		if(input.equalsIgnoreCase(dup)) {
			System.out.println("Paliondrome");
		}else {
			System.out.println("Not a palindrome");
		}sc.close();
	}
}

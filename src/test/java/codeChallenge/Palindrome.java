package codeChallenge;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		int reverse, q = 0; 
		System.out.println("Enter a number to find it's Palindrome or not ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int temp = input;

		while(input > 0 ) {				
			reverse = input %10;
			input = input /10;
			q = q *10 +reverse;
		}
		if(temp==q) {
			System.out.println("Entered number "+temp+" is a palindrome");
		}else
		{
			System.out.println("Entered number "+temp+" is not a  palindrome");
		}
		sc.close();
	}

}

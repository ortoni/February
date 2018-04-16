package codeChallenge;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {

		int rem, sum = 0; 
		System.out.println("Enter a number to find Sum of Digits ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		while(input > 0 ) {				
			rem = input %10;
			input = input /10;
			sum = sum + rem;
		}
		
			System.out.println("Sum of digits are: "+sum);
				sc.close();
	}

}

package codeChallenge;

import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		int i;
		long fact = 1;
		System.out.println("Enter a number to find Factorial: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print("Factorial of "+num+" is ");
		for( i = num; i > 0; i--) {
			fact = i*fact;
			System.out.print(i+"*");
		}	
		System.out.println(" = "+fact);
		sc.close();
	}

}

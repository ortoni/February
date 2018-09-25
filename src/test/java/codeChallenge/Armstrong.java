package codeChallenge;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		System.out.println("Enter a three digit numbers to find its Armstrong or not: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int temp= input;
		int arm = 0;
		while(input > 0) {
			int rev = input % 10;
			input = input / 10;	
			arm  += (rev*rev*rev);
		}
		if(arm == temp) {
			System.out.println(temp+" is an Armstrong number :)");
		}else {
			System.out.println(temp+" is not an Armstrong number :(");	
		}sc.close();
	}

}

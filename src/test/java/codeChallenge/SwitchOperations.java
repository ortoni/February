package codeChallenge;

import java.util.Scanner;

public class SwitchOperations {

	public static void main(String[] args) {
		System.out.println("Enter two numbers: ");

		int num1, num2; /*result = 0;*/
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("Enter a operation to perfrom: add, mul, sub, div ");
		String oper = sc.next();
		switch (oper) {
		case "add":
			System.out.println(num1 + num2);
			break;
		case "sub":
			System.out.println(num1 - num2);
			break;
		case "mul":
			System.out.println(num1 * num2);
			break;
		case "div":
			System.out.println(num1 / num2);
			break;
		default:
			System.out.println("Opertor cannot be determined");
		}
		sc.close();
	}
}

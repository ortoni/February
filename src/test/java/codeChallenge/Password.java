package codeChallenge;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		System.out.println("Enter a password: ");
		Scanner sc = new Scanner(System.in);
		String pass = sc.next();
		sc.close();
		if(isValid(pass)) {
			System.out.println("Password is valid");
		}else {
			System.out.println("Invalid");
		}
	}

	public static boolean isValid(String password) {
	//	int countUpper = 0, countDigit = 0, countLetter = 0;
		char c;
		if(password.length() < 10) {
			System.out.println("Password length must be atleast 10 characters");
			return false;
		}else {
			for(int i = 0; i < password.length() - 1; i++) {
				c = password.charAt(i);
				if(Character.isLetterOrDigit(c)) {
					System.out.println("Password must not contain any special character");
					return false;
				}
			}
			
		}
		return true;
		//return false;
	}
}		
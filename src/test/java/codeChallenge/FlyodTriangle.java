package codeChallenge;

import java.util.Scanner;

public class FlyodTriangle {

	public static void main(String[] args) {
		System.out.println("Enter a number to show floyd tree: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k=1;
		for(int i = 1; i < n+1; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(k+" ");
				k++;
			}System.out.println();
		}sc.close();

	}

}

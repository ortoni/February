package codeChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Ascending {

	public static void main(String[] args) {
		System.out.println("Enter a number to find Sum of Digits ");
		Scanner sc = new Scanner(System.in);
		int origDigit = sc.nextInt();
		int digit = origDigit;
		String digitStr = origDigit+"";
		int[] arr = new int[digitStr.length()];
		int index = 0, val;
		while(digit>0){
			val = digit%10;
			digit = digit/10;
			arr[index] = val;
			index++;
		}
		Arrays.sort(arr);

		System.out.print("The ascending order of number "+origDigit+" is ");
		for (int j : arr) {
			System.out.print(j);
		}
		sc.close();
	}

}

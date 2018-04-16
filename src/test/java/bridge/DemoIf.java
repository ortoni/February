package bridge;

import java.util.Scanner;

public class DemoIf {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);	 // Scanner is a class, which is used to get input from user
		System.out.println("Enter any number ");
		int numb = sc.nextInt(); // nextInt is method used to get input as Integers
		if (numb == 1)
			System.out.println("I am 1");
		else if (numb == 2) {
			System.out.println("I am 2");
		}
		else if(numb == 3)
			System.out.println("I am 3");
		else if(numb == 4 && numb > 3){
			System.out.println("I am not the above 3 defined number");			
		}
		sc.close();
	}

}

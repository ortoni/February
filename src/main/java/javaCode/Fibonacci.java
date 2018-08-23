package javaCode;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.print("Enter The Value Of n: ");
		 Scanner scr=new Scanner(System.in);
		 int n=scr.nextInt();
		 int f1 = 0;
		 int f2 = 1;
		int t=f1+f2;
		 System.out.print(f1 +" ");
	        while(t<=n)
	        {
	            System.out.print(t + " ");
	            t=f1+f2;
	            f1 = f2;
	            f2 = t;
	        }
	    }

	}

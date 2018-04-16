package codeChallenge;

import java.util.HashSet;
import java.util.Set;

public class ArrayListFIndRepeat {

	public static void main(String[] args) {

		//int[] a = {13,15,67,88,65,13,99,67,65,87,13}; 
		//The result should be – Duplicated numbers are 13 67 65
		int a[]={13,15,67,88,65,13,67,99,65,87,13,99,199,99,99,199};
		int n=a.length-1;
		System.out.print("Duplicates number are: ");
		for (int i = 0; i < n; i++) 
		{
			for (int j = i + 1; j < n; j++) 
			{
				if (a[i] == a[j]  && (i != j)) 
					System.out.print(a[i]+" ");
			}

		}
	}
}
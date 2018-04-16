package codeChallenge;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int a[]={12,15,67,88,65,13,67,99,65,87,13,99,199};
		int n=a.length;
		Arrays.sort(a);
		for(int i=0; i<n;i++) {
			
			System.out.println(a[i]);
		}

	}

}

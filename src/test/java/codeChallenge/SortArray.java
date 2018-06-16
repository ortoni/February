package codeChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArray {

	public static void main(String[] args) {
		int a[]={13,67,88,65,13,95,67,65,87,95,99,99};	
		Arrays.sort(a);
		System.out.println(a[a.length-2]);
		/*List<Integer> list = new ArrayList<>(a.length);
		for (int i : list) {
			list.add(Integer.valueOf(i));
		}
		Collections.sort(list);
		System.out.println(list);
*/
	}

}
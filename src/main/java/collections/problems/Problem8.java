package collections.problems;

import java.util.ArrayList;
import java.util.List;


public class Problem8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
		int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};

		List<Integer> list1 = new ArrayList<Integer>();
		for (int i = 0; i < array1.length; i++) {
			list1.add(array1[i]);
		}
		List<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i < array2.length; i++) {
			list2.add(array2[i]);

		}

		list2.retainAll(list1);  
		System.out.println(list2);
		list1.removeAll(list2);  
		
		for(Integer value: list1){
			System.out.println(value);
		}


	}

}










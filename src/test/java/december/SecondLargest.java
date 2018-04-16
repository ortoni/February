package december;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int[] arr = {-5,-2,-8,0,-7};
		System.out.println("Original input "+Arrays.toString(arr));
		int n = arr.length;
		Arrays.sort(arr);
		System.out.println("After Sorting "+Arrays.toString(arr));
		System.out.println("Second largets "+arr[n-2]);

	}

}

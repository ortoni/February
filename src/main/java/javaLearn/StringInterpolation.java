package javaLearn;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringInterpolation {


	public static void main(String[] args) {
		

		String c = "testleaf";
		System.out.println(c.getClass());

		//Reverse a String 1
		char[] charArray = c.toCharArray();
		for (int i = charArray.length -1; i >= 0; i--) {
			char element = charArray[i];
			System.out.println(element);
		}
		System.out.println("");

		//Reverse a String 2
		for (int i = charArray.length -1; i >= 0; i--) {
			System.out.println(c.charAt(i));
		}

		//Occurrence of a char in a given String
		int count = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (c.charAt(i) == 't' ) {
				count++;
			} 	
		}
		System.out.println("\nCount");
		System.out.println(count);

		
		// Using Set
		Set<Character> set = new LinkedHashSet<Character>();
		for (char eachChar : c.toCharArray()) {
		//	System.out.println(eachChar);
			set.add(eachChar);
			
		}
		System.out.println(set);
		for (Character character : set) {
			System.out.print(character);
		}




	}
}

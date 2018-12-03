package interviewPre_a;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveAllDups {

	public static void main(String[] args) {
		String str = "maximum occurances of Chars".toLowerCase();
		
		// remove duplicates:
		char[] charArray = str.toCharArray();
		Set<Character> set = new LinkedHashSet<>();
		for (Character character : charArray) {
			set.add(character);
		}
		System.out.println(set);
		String temp1 = "";
		for (Character character : set) {
			temp1+=character;
		}
		
		System.out.println(temp1);
		
		
		// duplicates found
		String temp = "";
		for (int i = 0; i < charArray.length; i++) {
			for (int j = i+1; j < charArray.length; j++) {
				if(str.charAt(i) ==str.charAt(j)) {
					temp = temp+str.charAt(i);
				}
			}
		}
		System.out.println(temp);
		System.out.println(temp.length());
//		str.re

	}

}

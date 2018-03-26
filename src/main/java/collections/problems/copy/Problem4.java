package collections.problems.copy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;



public class Problem4 {


	public static void main(String[] args) {

		// Your  Request Portion
		String[][] names = {
				{"Babu", "TestLeaf", "Red"},
				{"Gopi", "Qeagle"},
				{"Viru"}
		};
		returnNameFirstLast(names);
	}


	public static void returnNameFirstLast(String[][] names){
		Map<Character, Character> flName = new LinkedHashMap<Character, Character>();
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				System.out.println(names[i][j]);
				flName.put(names[i][j].charAt(0), names[i][j].charAt(names[i][j].length()-1));
			}
		}
		System.out.println(flName);
	}

}












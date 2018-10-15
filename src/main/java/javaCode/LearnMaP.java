package javaCode;

import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

public class LearnMaP {

	public static void main(String[] args) {
		//Step 1
		String txt ="testleaf";
		
		//Step 2
		char[] ch = txt.toCharArray();
		
		//Step 3 
		Map<Character, Integer> map = new HashedMap<>();
		
		//Step 4
		for (char c : ch) {
			
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		
		
		
		
		
		
		
		

	}

}

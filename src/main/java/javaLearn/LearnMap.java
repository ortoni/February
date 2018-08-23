package javaLearn;

import java.util.LinkedHashMap;
import java.util.Map;

public class LearnMap {

	public static void main(String[] args) {
		
		String a = "testleaf";
		char[] charArray = a.toCharArray();

		Map<Character, Integer> map = new LinkedHashMap<>();
		map.clear();
		for (char c : charArray) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}

}

package interviewPre;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapProgram {

	public static void main(String[] args) {

		String str = "koushik chatterjee";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		// To display in []
		System.out.println(map);

		// To display in line by line
		for (Entry<Character, Integer> c : map.entrySet()) {
			System.out.print(c.getKey()+" --- ");

			System.out.println(c.getValue());
		}
		// To display only the max key and value
		int max = 0;
		char a =  0;
		for (Entry<Character, Integer> c : map.entrySet()) {
			if (max < c.getValue()) {
				max = c.getValue();
				a = c.getKey();
			}
		}
		System.out.println("the max no.of char is "+a +" and max number is "+max);

		// To display only the character
		Set<Character> keySet = map.keySet();
		List<Character> ls = new ArrayList<Character>();
		ls.addAll(keySet);
		//System.out.println(ls);


	}

}

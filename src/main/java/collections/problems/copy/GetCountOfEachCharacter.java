package collections.problems.copy;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class GetCountOfEachCharacter {

	public static void main(String[] args) {
		String data = "Amazon India Development Center";
		System.out.println(data.length()+1);
		char[] charArray = data.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (char c : charArray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		//	System.out.println(map);
		Integer maxCount = 0;
		char maxChar = 0;
		for (Entry<Character, Integer> charKey : map.entrySet()) {

			if(charKey.getValue() >= maxCount){
				maxCount = charKey.getValue();
				maxChar = charKey.getKey();

				System.out.println("The key is: "+charKey.getKey()+""
						+ " and value is: "+charKey.getValue());
			}
		}
	}
}
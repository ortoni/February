package interviewPre;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccuranceOfEachChar {

	public static void main(String[] args) {
		String str = "i am a programmer";
		char[] eachChar = str.toCharArray();
		int max = 0;
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (char c : eachChar) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		Collection<Integer> values = map.values();
		for (Integer i : values) {
			if (max < i) {
				max = i;
			}
		}
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() == max) {
				System.out.println(entry.getKey());
			}
		}
	}

}

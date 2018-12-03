package interviewPre_a;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.collections4.map.HashedMap;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MaximumOccurancesOfChars {
	@DataProvider(name = "a")
	public String[][] data() {
		String[][] s = new String[2][1];
		s[0][0] = "koushik";
		s[1][0] = "preethy"; 
		return s;
	}
	// 1) How to find the maximum occurring character in given String?
	@Test(dataProvider = "a")
	private void maximumOccurancesoFCharacter(String s) {
		char[] charArray = s.toCharArray();
		HashedMap<Character, Integer> map = new HashedMap<>();
		for (char c : charArray) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		int max = 0;
		Collection<Integer> values = map.values();
		for (Integer i : values) {
			if (max < i) {
				max = i;
			}
		}
//		System.out.println(max);
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			if(entry.getValue() ==  max){
				System.out.println(entry.getKey());
			}
		}

	}

}

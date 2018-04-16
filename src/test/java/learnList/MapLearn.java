package learnList;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapLearn {

	public static void main(String[] args) {
		System.out.println("Enter a string to find repetative letters");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//String str = "koushik chatterjee";
		char[] c = 	str.toCharArray();
		Map<Character, Integer> obj = new LinkedHashMap<Character, Integer>();
		for (char d : c) {
			if(obj.containsKey(d)){
				int e = obj.get(d)+1;
				obj.put(d,e);
			}
			else{
				obj.put(d, 1);			
			}
		}
		//System.out.println(obj);	//	To display in {} format
		int maxCount = 0;
		char maxChar = 0;
		//Set<Entry<Character, Integer>> entry = obj.entrySet();	// To display in []
		for (Entry<Character, Integer> ent : obj.entrySet()) {
			if(ent.getValue() >= maxCount) {
				maxCount = ent.getValue();
				maxChar = ent.getKey();
			}
		}	System.out.println(maxChar+" --> "+maxCount);
	}

}

package javaChallenge;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class RepeatCount {

	public static void main(String[] args) {
		int count;
		HashMap<Character, Integer> ma = new LinkedHashMap<Character, Integer>();

		String str = "I mam getting bette evey day";
		for (char character : str .toCharArray()) {
			if (ma.containsKey(character)) {
				count = ma.get(character);
				ma.put(character, count + 1);
			} else {
				ma.put(character, 1);
			}
		}
		for (Entry<Character, Integer> entry : ma.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue()); 
		}
	}
}

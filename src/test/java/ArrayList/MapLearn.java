package ArrayList;

import java.util.LinkedHashMap;
import java.util.Map;


public class MapLearn {

	public static void main(String[] args) {

		String str = "AMAZON";
	char[] c = 	str.toCharArray();
	Map<Character, Integer> obj = new LinkedHashMap<Character, Integer>();
	for (char d : c) {
		if(obj.containsKey(d)){
		//obj.get(d, get(c)+1);
			int e = obj.get(d)+1;
			obj.put(d,e);
		}
		else{
			obj.put(d, 1);			
		}
		System.out.println(obj);	
	}
	}

}

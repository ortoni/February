package learnList;

import java.util.LinkedHashSet;
import java.util.Set;


public class SetLearn {
public static void main(String[] args) {
	Set<String> obj = new LinkedHashSet<String>();
	obj.add("HCL");
	obj.add("INFY");
	obj.add("TCS");
	
	for (String string : obj) {
		System.out.println(string);
	}
}
}

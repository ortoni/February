package tricksJavaSel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortNames {

	public static void main(String[] args) {
		// Using List
		/*List<String> ls = new ArrayList<String>();
		ls.add("John");
		ls.add("Pradeep");
		ls.add("Mary");
		ls.add("Ramya");
		Collections.sort(ls);
		System.out.println("Sorted names are: ");
		for (String names : ls) {
			System.out.println(names);
		}*/
		
		// Using TreeSet
		/*Set<String> st = new TreeSet<String>();
		st.add("John");
		st.add("Pradeep");
		st.add("Mary");
		st.add("Ramya");
		for (String names : st) {
			System.out.println(names);
		}*/
		
		//Using Array
		String[] name =  new String[4];
		
		name[1] = "John";
		name[2] = "Pradeep";
		name[3] = "Mary";
		name[0] = "Ramya";
		Arrays.sort(name);
		for (String string : name) {
			System.out.println(string);
			
		}
		
	}
	
}


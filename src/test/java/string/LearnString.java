package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnString {

	public static void main(String[] args) {

		// Define the pattern
		String pattern = "(will)|(this)";

		// Compile the pattern
		Pattern p = Pattern.compile(pattern);	

		// Get the matcher	
		Matcher match = p.matcher("I will crack this question");	

		System.out.println(match.groupCount());

		// if multiple matches
		int i = 0;
			while (match.find()) {
				i++;
			}
			System.out.println(i);

	}
}

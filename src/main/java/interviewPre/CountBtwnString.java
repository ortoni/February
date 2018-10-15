package interviewPre;

import java.util.ArrayList;
import java.util.List;

public class CountBtwnString {

	public static void main(String[] args) {
		
		List<String> ls = new ArrayList<>();
		
		String str = "hi a im jinglaes ofa sdfg";
		String substring = str.substring(str.indexOf("a")+1, str.lastIndexOf("a"));
		System.out.println("The length between first occurance of a and last occurance of a is: "+substring.length());
		System.out.println("The Characters are: "+substring);
		System.out.println("without space :"+substring.trim().length());
	}

}

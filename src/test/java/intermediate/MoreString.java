package intermediate;

public class MoreString {

	public static void main(String[] args) {
		//putting strings in s
		String s = "koushik chatterjee";
		
		//Searching by index while skipping first 2 index
		System.out.println(s.indexOf("j",2));
		
		//Concatenation 
		String a = "koushik";
		String b = "Dhivya";
		System.out.println(a.concat(b));
		System.out.println(a.toUpperCase());
		System.out.println(b.toLowerCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.length());
	}

}

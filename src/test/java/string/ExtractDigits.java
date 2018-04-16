package string;

public class ExtractDigits {

	public static void main(String[] args) {
		String s = "helloThisIsA1234Sample";
		String sa = s.replaceAll("\\D","");
		int res = Integer.parseInt(sa);
	System.out.println(res);
	}

}

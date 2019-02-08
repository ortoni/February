package interviewPre;

public class CapFirstWordLet {

	public static void main(String[] args) {
		String s = "capitialize first letter of the words";
		String[] split = s.split("\\s");
		String x = "";
		for (String splittedString : split) {
			// One way
			char a = splittedString.toUpperCase().charAt(0);
			x += splittedString.replace(splittedString.charAt(0), a)+" ";

			// another way

			//char decrementedChar = (char)(splittedString.charAt(0)-32);
			//x += splittedString.replace(splittedString.charAt(0), decrementedChar)+" ";
		}
		System.out.println(x.trim());	
	}

}

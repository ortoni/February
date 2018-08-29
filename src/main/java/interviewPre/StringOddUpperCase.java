package interviewPre;

public class StringOddUpperCase {

	public static void main(String[] args) {
		String st = "koushik chatterjee";
		for (int i = 0; i < st.length(); i++) {
			if (i %2 != 0) {
				System.out.print(Character.toUpperCase(st.charAt(i)));
			}else {
				System.out.print(Character.toLowerCase(st.charAt(i)));				
			}
		}
	}
}
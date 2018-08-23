package hw;

public class ReplaceA {

	public static void main(String[] args) {
		
		String st = "xabCDxxSScx";
		
		char[] charArray = st.toCharArray();
		String x ="";
		for (char c : charArray) {
			
			if (c == 'x') {
				x += c;
			}
		}
		String s = st.replaceAll("x", "");
		System.out.println(s+x);
		
		

	}

}

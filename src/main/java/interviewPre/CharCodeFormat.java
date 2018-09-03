package interviewPre;

public class CharCodeFormat {

	public static void main(String[] args) {
		// Input
		String str = "abce";
		// Output  = bcde
		String output = "";
		for(int i=0;i<str.length();i++){
			
			output+= (char)(str.charAt(i)+1);
		}
		System.out.println(output);
		
		
	}

}

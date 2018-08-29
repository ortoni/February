package interviewPre;

public class CharCodeFormat {

	public static void main(String[] args) {
		// Input
		String str = "abcD";
		// Output  = bcde
		String strIncremented=new String();
		for(int i=0;i<str.length();i++){
			strIncremented = strIncremented +(char)(str.charAt(i)+1);
		}
		System.out.println(strIncremented);
		
		
	}

}

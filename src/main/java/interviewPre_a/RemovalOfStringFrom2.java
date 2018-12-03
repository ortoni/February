package interviewPre_a;

public class RemovalOfStringFrom2 {
	public static void main(String[] args) {
		String s1 = "some string";
		String s2 = "soting";
		char[] charArray = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();
		String temp ="";
		for (int i = 0; i < charArray.length; i++) {
			for (int j = 0; j < charArray2.length; j++) {
				if(i ==j) {
					temp+=s1.charAt(j);
				}	
			}
		}
		s1 = temp;
		System.out.println(s1);
	}

}

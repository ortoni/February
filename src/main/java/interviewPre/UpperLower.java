package interviewPre;

public class UpperLower {
	public static void main(String[] args) {
		String name = "testleaf";
		// One way
		char[] charArray = name.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (i%2==0) {
				System.out.print((char)(name.charAt(i)-32));
			}else 
			{
				System.out.print(name.charAt(i));
			}				
		}
		// another way
		for (int i = 0; i < charArray.length; i++) {
			if(i%2==0) {
				System.out.print(Character.toLowerCase(charArray[i]));
			}else {
				System.out.print(Character.toUpperCase(charArray[i]));

			}
		}
	}

}

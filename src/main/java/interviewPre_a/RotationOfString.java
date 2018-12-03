package interviewPre_a;

public class RotationOfString {
	// Reverse & Rotation
	public static void main(String[] args) {
		findRotation("madam");
	}

	private static String findRotation(String s) {
		String temp = "";
		for (int i = s.length() -1; i >= 0; i--) {
			temp += s.charAt(i);
		}
		if(temp.equals(s)) {
			System.out.println("Rotation is same");
		}else {
			return "Not Plaindrome";
		}
		return temp;
	}

}

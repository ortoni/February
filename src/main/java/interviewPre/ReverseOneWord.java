package interviewPre;

public class ReverseOneWord {

	public static void main(String[] args) {
		String str = "Hello World";
		String temp = "";
		String[] split = str.split("\\s");
		char[] array = split[1].toCharArray();
		for (int i = array.length - 1; i >= 0; i--) {
			temp += array[i];
		}
		System.out.println(split[0] + " " + temp.trim());
	}
}

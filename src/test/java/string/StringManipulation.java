package string;


public class StringManipulation {

	public static void main(String[] args) {
		String st = "Java is easy, if you understand the concepts";
		System.out.println(st);
		System.out.println("Characters inculding space "+st.length());
		System.out.println("*********************");
		String[] data = st.split(" ");
		System.out.println("counting by words: "+data.length);
		System.out.println("*********************");
				
		int reverse = st.length();
		System.out.println(reverse);
		System.out.println("Reverse is :");
		for(int i = reverse-1; i >=0; i--){
			System.out.print(st.charAt(i));
		}
		
		boolean s = st.contains("e");
		System.out.println();		
		System.out.println("*********************");
		System.out.println(s);
	}
}
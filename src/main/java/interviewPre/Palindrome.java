package interviewPre;

public class Palindrome {

	public static void main(String[] args) {	
	
		String st = "anna";
		if(new StringBuffer(st).reverse().toString().equals(st)){
			System.out.println("Palindrome");
		}else{
			System.out.println(new StringBuffer(st).reverse());
		}
	}
}

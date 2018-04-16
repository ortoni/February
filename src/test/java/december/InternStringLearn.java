package december;

public class InternStringLearn {

	public static void main(String[] args) {
		String s1 = new String("hi i am koushik");
		String s2 = "hi i am koushik";
		System.out.println("is s1 Empty ? "+s2.isEmpty());	
		String s3 = s1.intern();
		System.out.println("is si and s2 equals "+s1 == s2);
		System.out.println("is si and s2 equals using .euqls "+s1.equals(s2));
		if(s1 == s2){
			System.out.println("s1 == s2 same");
		}else{
			System.out.println("s1 == s2 not same");
		}
		System.out.println(s2 == s3);		
		System.out.println(s2.equals(s3));
	}
}
package tricksJavaSel;

import org.testng.annotations.Test;

public class RandomString {
	@Test
	public  void main() {
		System.out.println(generateRandomFolderName());
		
	}
	public String generateRandomFolderName() {
		long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L; 
		String num = Long.toString(number);
		return  num;
		
	}
}
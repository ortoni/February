package dailyprogram;

import java.util.Scanner;

public class Code_10_Regex {

	public static void main(String[] args) {  
		/*Write a Java method to check whether a string is a valid password. 
		 * Password rules:A password must have at least ten characters.
		 * A password consists of only letters and digits.
		 * A password must contain at least two digits and two letters.
		 * A password must contain at least one Capital letter. */
        Scanner input = new Scanner(System.in);  
        System.out.print("Please enter a Password: ");  
        String password1 = input.next();
        input.close();
        String regex = "^(?=.*[A-Z]+)(?=.*[A-Za-z]+)(?=.*[0-9]{2,})([A-Za-z0-9]{10,})$";
        if (password1.matches(regex)) {  
            System.out.println("Valid Password");  
        } else {  
            System.out.println("Invalid Password");  
        }
        /*if (isValid(password1)) {  
            System.out.println("Valid Password");  
        } else {  
            System.out.println("Invalid Password");  
        }*/  
    }  

   /* public static boolean isValid(String password) {  
    	char c;  
        int countDigits = 0,countLetters=0,countUpper=0;  
        if (password.length() < 10) { 
        	System.out.println("Password length should be atleast 10 characters");
            return false;  
        } else {      
            for (int i = 0; i < password.length() - 1; i++) {  
                c = password.charAt(i);  
                if (!Character.isLetterOrDigit(c)) {    
                	System.out.println("Password should not have special characters.");
                    return false;  
                } 
                if (Character.isDigit(c)) {  
                    countDigits++; 
                } else if(Character.isLetter(c)) {
                	countLetters++;
                } else if(Character.isUpperCase(c)){
                    countUpper++;
                }
            }  
            if(countDigits<2) {
            	System.out.println("Password must contain atleast 2 digits");
            	return false;
            }else if(countLetters<2) {
            	System.out.println("Password must contain atleast 2 letters");
            	return false;
            }else if(countUpper<1) {
            	System.out.println("Password must contain atleast 1 captial letter");
            	return false;
            }
        }  
        return true;  
    }*/ 

}

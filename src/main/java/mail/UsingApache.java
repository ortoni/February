package mail;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.testng.annotations.Test;

public class UsingApache {
@Test
	public void mail() throws EmailException {
		 Email mail = new SimpleEmail();
		 mail.setFrom("testleaf0150@gmail.com");
		// mail.
		 
	}
}

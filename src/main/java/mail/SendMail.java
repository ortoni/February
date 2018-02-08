package mail;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {

	public static void main(String[] args) throws AddressException, MessagingException {

		Properties props = new Properties();
		 props.put("mail.smtp.host", "smtp.gmail.com");    
         props.put("mail.smtp.socketFactory.port", "465");    
         props.put("mail.smtp.socketFactory.class",    
                   "javax.net.ssl.SSLSocketFactory");    
         props.put("mail.smtp.auth", "true");    
         props.put("mail.smtp.port", "465"); 
		Session session = Session.getDefaultInstance(props,  new Authenticator() {  
			 protected PasswordAuthentication getPasswordAuthentication() {  
				return new PasswordAuthentication("testleaf0150@gmail.com","leaf@123");  
			}
		} 				);	
		MimeMessage msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress("testleaf0150@gmail.com"));
		msg.addRecipient(Message.RecipientType.TO,new  InternetAddress("koushik3520@gmail.com"));
		msg.setHeader("Subject", "JavaXmail Test");
		/*Instant instant = Instant.now();
		Date d = Date.from(instant );
		msg.setSentDate(d );*/
		msg.setText("Another test mail");
		System.out.println("mail sent");
		Transport.send(msg);


	}

}

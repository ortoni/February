package mail;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendMailWithAttachment {

	public static void main(String[] args) throws AddressException, MessagingException, IOException {

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
		
		MimeBodyPart body = new MimeBodyPart();
		String file = "E:\\Koushik\\Documents\\M2.pdf";
		/*File file = new File("E:\\Koushik\\Documents\\M2.pdf");
		System.out.println(file);
		body.attachFile(file);*/
		body.attachFile(file);
		Multipart mp = new MimeMultipart();
		mp.addBodyPart(body);
	
		Transport.send(msg);
		System.out.println("mail sent");


	}

}

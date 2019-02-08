package mail;

import java.io.IOException;
import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.MimeMultipart;

import com.sun.mail.pop3.POP3Store;

public class ReadMail {
	public static void main(String[] args) throws MessagingException, IOException {
		Properties props = new Properties();
		props.put("mail.pop3.host", "pop.gmail.com");
		props.put("mail.pop3.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.pop3.socketFactory.fallback", "false");
		props.put("mail.pop3.port",  "995");
		props.put("mail.pop3.socketFactory.port", "995");
		props.put("mail.pop3.starttls.enable", "true");

		Session session = Session.getDefaultInstance(props);
		POP3Store store = (POP3Store) session.getStore("pop3");
		store.connect("testleaf0150@gmail.com", "leaf@123");
		 Folder emailFolder = store.getFolder("INBOX");
	      emailFolder.open(Folder.READ_ONLY);

	      // retrieve the messages from the folder in an array and print it
	      Message[] messages = emailFolder.getMessages();
	      System.out.println("messages.length---" + messages.length);

	      for (int j = 0; j < 5;j++) {
	         Message message = messages[j];
	         System.out.println("---------------------------------");
	         System.out.println("Email Number " + (j + 1));
	         System.out.println("Subject: " + message.getSubject());
	         System.out.println("From: " + message.getFrom()[0]);
	         System.out.println("Text: " + message.getContent());
	         MimeMultipart mimeMultipart = new MimeMultipart();
	         int count = mimeMultipart.getCount();	
	         for (int i = 0; i < count; i++) {
	        	 String result = null;
	             BodyPart bodyPart = mimeMultipart.getBodyPart(i);
	             if (bodyPart.isMimeType("text/plain")) {
	                 result = result + "\n" + bodyPart.getContent();
	                 break; // without break same text appears twice in my tests
	             } else if (bodyPart.isMimeType("text/html")) {
	                 String html = (String) bodyPart.getContent();
	                 result = result + "\n" + org.jsoup.Jsoup.parse(html).text();
	             } 
	         }
	      }

	      //close the store and folder objects
	      emailFolder.close(false);
	      store.close();

		  }
}

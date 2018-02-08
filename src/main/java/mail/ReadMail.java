package mail;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;

import com.sun.mail.pop3.POP3Store;

public class ReadMail {
	public static void main(String[] args) throws MessagingException, IOException {
		Properties props = new Properties();
		props.put("mail.pop3.host", "pop.gmail.com");
		props.put("mail.pop3.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.pop3.socketFactory.fallback", "false");
		props.put("mail.pop3.port",  "995");
		props.put("mail.pop3.socketFactory.port", "995");

		Session session = Session.getDefaultInstance(props);
		POP3Store store = (POP3Store) session.getStore("pop3");
		store.connect("testleaf0150@gmail.com", "leaf@123");
		System.out.println(store.getURLName());
		System.out.println(store.toString());
		System.out.println(store.getDefaultFolder());



		Folder inbox = store.getFolder("INBOX");

		inbox.open(Folder.HOLDS_MESSAGES);
		String fullName = inbox.getFullName();
		System.out.println(fullName);
		/*int messageCount = inbox.getMessageCount();
		System.out.println(messageCount);
		System.out.println(inbox.getUnreadMessageCount());
		Folder folder = inbox.getFolder("Bin");
		int unreadMessageCount = folder.getUnreadMessageCount();
		System.out.println(unreadMessageCount);*/

		Message[] messagearr = inbox.getMessages();
		for (int i =messagearr.length-1; i > 0; i--) {
			Message message = messagearr[i];
			/*	System.out.println("Subject");
			System.out.println(message.getSubject());
			System.out.println("All Recipients");
			System.out.println(message.getAllRecipients());
			System.out.println("All Recipients");*/
			//System.out.println(message.getContent());
		}
		
		//inbox.copyMessages(messagearr, inbox);


	}

}

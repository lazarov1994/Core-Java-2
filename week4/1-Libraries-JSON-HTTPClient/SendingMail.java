import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;


public class SendingMail {

	public static void main(String[] args) throws EmailException {
		EmailAttachment attachment = new EmailAttachment();
		  attachment.setPath("C:\\Users\\Lazarov94\\Desktop\\azbW3zq_460sa_v1.gif");
		  attachment.setDisposition(EmailAttachment.ATTACHMENT);
		  attachment.setDescription("Picture of Horse");
		  attachment.setName("Horse");
		  
		  MultiPartEmail email = new MultiPartEmail();
		  email.setSmtpPort(465);
		  email.setAuthenticator(new DefaultAuthenticator("lazarov686@gmail.com", "Leonardo555l0rencia55555"));
		  email.setSSLOnConnect(true);
		  email.setHostName("smtp.gmail.com");
		  email.addTo("lazarov686@gmail.com");
		  email.setFrom("lazarov686@gmail.com");
		  email.setSubject("The gift");
		  email.setMsg("Here is the picture you wanted");
		  
		  email.attach(attachment);
		  
		  email.send();
		  
		 
		
	}

}

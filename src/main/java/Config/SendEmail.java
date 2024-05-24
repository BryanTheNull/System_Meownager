package Config;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {

    private static String EMAIL_FROM = "meownager.notifications@gmail.com";
    private static String PASSWORD = "dvhsypxenicwhimt";
    private String emailTo;
    private String subject;
    private String content;

    private Properties properties;
    private Session session;
    private MimeMessage correo;

    public SendEmail(String emailTo, String subject, String content) {
        this.emailTo = emailTo;
        this.subject = subject;
        this.content = content;

        // Inicar propiedades
        properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        session = Session.getInstance(properties,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(EMAIL_FROM, PASSWORD);
            }
        });
    }

    public void send() {
        try {
            correo = new MimeMessage(session);
            correo.setFrom(new InternetAddress(EMAIL_FROM));
            correo.addRecipient(Message.RecipientType.TO, new InternetAddress(emailTo));
            correo.setSubject(subject);
            correo.setText(content);

            Transport.send(correo);
            System.out.println("¡El correo ha sido enviado!");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

}

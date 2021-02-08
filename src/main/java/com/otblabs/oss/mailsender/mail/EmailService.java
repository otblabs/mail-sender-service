package com.otblabs.oss.mailsender.mail;


import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.*;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

@Service
public class EmailService {

    public void sendMail(EmailTemplate emailTemplate) throws MessagingException, IOException {

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.zoho.com");
        props.put("mail.smtp.port", "465");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(emailTemplate.getSenderAccount().getEmailAddress(), emailTemplate.getSenderAccount().getPassword());
            }
        });
        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress(emailTemplate.getSenderAccount().getEmailAddress(), false));

        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailTemplate.getRecipientEmail()));
        msg.setSubject(emailTemplate.getSubject());
        msg.setContent(emailTemplate.getHeaderContent(), "text/html");
        msg.setSentDate(new Date());

        MimeBodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setContent(emailTemplate.getMailContent(), "text/html");

        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);
        MimeBodyPart attachPart = new MimeBodyPart();

        attachPart.attachFile(emailTemplate.getAttachementFile());
        multipart.addBodyPart(attachPart);
        msg.setContent(multipart);
        Transport.send(msg);
    }


}

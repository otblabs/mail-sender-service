package com.otblabs.oss.mailsender.mail;


import org.springframework.web.bind.annotation.*;
import javax.mail.MessagingException;
import java.io.IOException;
import java.util.EnumMap;

@RestController
@RequestMapping("/send-mail")
@CrossOrigin("*")
public class MailSenderResource {


    private final EmailService emailService;

    public MailSenderResource(EmailService emailService) {
        this.emailService = emailService;
    }


    @PostMapping
    public void sendMail(@RequestBody EmailTemplate emailTemplate){
        try {
            emailService.sendMail(emailTemplate);
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

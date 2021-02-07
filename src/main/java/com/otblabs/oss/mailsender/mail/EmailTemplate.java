package com.otblabs.oss.mailsender.mail;

public class EmailTemplate {

    private String recipientUsername;
    private String recipientEmail;
    private String subject;
    private String headerContent;
    private String mailContent;
    private String attachementFile;

    public EmailTemplate() {
    }

    public String getRecipientUsername() {
        return recipientUsername;
    }

    public void setRecipientUsername(String recipientUsername) {
        this.recipientUsername = recipientUsername;
    }

    public String getRecipientEmail() {
        return recipientEmail;
    }

    public void setRecipientEmail(String recipientEmail) {
        this.recipientEmail = recipientEmail;
    }



    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMailContent() {
        return mailContent;
    }

    public String getHeaderContent() {
        return headerContent;
    }

    public void setHeaderContent(String headerContent) {
        this.headerContent = headerContent;
    }

    public void setMailContent(String mailContent) {
        this.mailContent = mailContent;
    }

    public String getAttachementFile() {
        return attachementFile;
    }

    public void setAttachementFile(String attachementFile) {
        this.attachementFile = attachementFile;
    }
}

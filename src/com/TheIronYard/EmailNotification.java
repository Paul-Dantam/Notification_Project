package com.TheIronYard;

import java.time.LocalDateTime;

public class EmailNotification extends Notification {

    private String recipient;
    private String smtpProvider;

    public EmailNotification(LocalDateTime createdAt, String subject, String body, String recipient, String smtpProvider) {
        super(createdAt, subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
        this.status = "email";
    }


    @Override
    public void transport() throws NoTransportException {
        System.out.println(getRecipient());
        System.out.println(getSmtpProvider());
        System.out.println(getSubject());
        System.out.println(getBody());
        System.out.println(getCreatedAt());
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    @Override
    protected void testText() {
        super.testText();
        System.out.println("This is the text from Email Notification!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmailNotification)) return false;

        EmailNotification that = (EmailNotification) o;

        if (!getRecipient().equals(that.getRecipient())) return false;
        return getSmtpProvider().equals(that.getSmtpProvider());
    }

    @Override
    public int hashCode() {
        int result = getRecipient().hashCode();
        result = 31 * result + getSmtpProvider().hashCode();
        return result;
    }

    @Override
    protected Object clone() {

        return new EmailNotification(getCreatedAt(), getSubject(), getBody(), getRecipient(), getSmtpProvider() );
    }
}

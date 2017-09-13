package com.TheIronYard;

import java.time.LocalDateTime;

public class EmailNotification extends Notification {

    private String recipient;
    private String smtpProvider;

    public EmailNotification(LocalDateTime createdAt, String subject, String body, String recipient, String smtpProvider) {
        super(createdAt, subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
    }


    @Override
    public void transport() throws NoTransportException {
        System.out.println(recipient);
        System.out.println(smtpProvider);
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
}

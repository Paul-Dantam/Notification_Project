package com.TheIronYard;

import java.time.LocalDateTime;

public class TextNotification extends Notification {

    private String recipient;
    private String smsProvider;



    @Override
    public void transport() throws NoTransportException {
        System.out.println(recipient);
        System.out.println(smsProvider);
        System.out.println(getSubject());
        System.out.println(getBody());
        System.out.println(getCreatedAt());
    }

    public TextNotification(LocalDateTime createdAt, String subject, String body, String recipient, String smsProvider) {
        super(createdAt, subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }
}

package com.TheIronYard;

import java.time.LocalDateTime;

public abstract class Notification {

    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status;

    public Notification(LocalDateTime createdAt, String subject, String body) {
        this.createdAt = LocalDateTime.now();
        this.subject = subject;
        this.body = body;
        this.status = "default";
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public abstract void transport() throws NoTransportException;

    protected void testText(){
        System.out.println("Check out this test text!");
    }
    public void showStatus(){
        System.out.println("Status Message: "+status);
    }
}

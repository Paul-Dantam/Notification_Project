package com.TheIronYard;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) throws NoTransportException {

        EmailNotification eNote = new EmailNotification(LocalDateTime.now(), "job", "get a jerb",
                                                                                 "Me", "wife" );


        eNote.transport();
        eNote.showStatus();
        eNote.testText();


        EmailNotification eNoteClone = (EmailNotification) eNote.clone();
        eNote.equals(eNoteClone);


        TextNotification tNote = new TextNotification(LocalDateTime.now(), "wake up", "now",
                                                                                "me", "alarm");


        tNote.transport();
        tNote.showStatus();






    }

}

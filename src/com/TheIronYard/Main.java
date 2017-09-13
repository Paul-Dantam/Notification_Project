package com.TheIronYard;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        EmailNotification eNote = new EmailNotification(LocalDateTime.now(), "job", "get a jerb",
                                                                                 "Me", "wife" );


        eNote.transport();


        TextNotification tNote = new TextNotification(LocalDateTime.now(), "wake up", "now",
                                                                                "me", "alarm");


        tNote.transport();






    }

}

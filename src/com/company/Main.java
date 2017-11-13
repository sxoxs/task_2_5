package com.company;

import java.io.IOException;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {

        User user = new User();
        user.setName("Denis");

        user.createList("Учеба");
        user.lists.get(0).addTask();
        user.lists.get(0).outTask(0);

        Notificator notificator = new Notificator();
        notificator.notifi(user);
    }
}

package com.company;

import java.io.IOException;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        Menu menu = new Menu();
        User user = new User();

        user.setName("Denis");
        user.createList("Учеба");
//        user.getLists().get(0).addTask();
//        user.getLists().get(0).outTask(0);

        menu.showMenu(user);

        System.out.println("Работа завершена");
    }

}

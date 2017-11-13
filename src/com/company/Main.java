package com.company;

import java.io.IOException;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
//        Каюсь, не было времени всё привести в порядок.
//        Завал на работе и выходные вылетели.
//        Технически оно работает
//        Позже доправлю менюшку и нормальные быстрые выборы дать и добавление задач

//        Знаю, это плохой тон писать так коменты

        User user = new User();
        user.setName("Denis");

        user.createList("Учеба");
        user.lists.get(0).addTask();
        user.lists.get(0).outTask(0);

        Notificator notificator = new Notificator();
        notificator.notifi(user);
    }
}

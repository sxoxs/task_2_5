package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

/**
 * Created by Денис on 14/11/17.
 */
public class Menu {
    public void showMenu(User user) throws IOException, ParseException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Notificator notificator = new Notificator();

        while (true) {
            System.out.println("Выберите пункт");
            System.out.println("1. Создать лист заданий");
            System.out.println("2. Выбрать лист заданий");
            System.out.println("3. Вывод заданий");
            System.out.println("4. Выход");

            switch (br.readLine().charAt(0)){
                case '1': {
                    System.out.println("Введите название листа");
                    user.createList(br.readLine());
                    break;
                }
                case '2': {
                    checkListTask(user);
                    break;
                }
                case '3': {
                    notificator.notifi(user);
                    break;
                }
                case '4': {
                    return;
                }
            }
        }
    }

    private void checkListTask(User user) throws IOException, ParseException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Выберите лист:");

        int indexList;

        for (indexList = 0; indexList < user.getLists().size(); indexList++) {
            sb.append(indexList + 1).append(". ").append(user.getLists().get(indexList).getName());
            System.out.println(sb.toString());
            sb.delete(0, sb.length());
        }
        indexList = (Integer.parseInt(br.readLine().trim()) - 1);

        System.out.println("1. Добавить задание");
        System.out.println("2. Вывод заданий");

        switch (br.readLine().trim().charAt(0)) {
            case '1': {
                user.getLists().get(indexList).addTask();
                break;
            }
            case '2': {
                Notificator notificator = new Notificator();
                notificator.notifi(user.getLists().get(indexList));
                break;
            }
        }
    }

}

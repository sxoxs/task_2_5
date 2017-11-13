package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Денис on 13/11/17.
 */
public class Notificator {
    public void notifi (User user) throws IOException, ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("hh.mm dd.MM.yyyy");
        Date dateBegin;
        Date dateEnd;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите начало временного отрезка (дд.мм.гггг)");
        dateBegin = sdf.parse("00.00 " +br.readLine());

        System.out.println("Введите конец временного отрезка (дд.мм.гггг)");
        dateEnd = sdf.parse("23.59 " + br.readLine());

        SearchActualTask search = new SearchActualTask();

        for (int i = 0; i < user.lists.size(); i++) {
            if (search.containsActualTask(user.lists.get(i), dateBegin, dateEnd)) {
                search.outActtualTask(user.lists.get(i), dateBegin, dateEnd);
            }
        }
    }
}

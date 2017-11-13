package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by Денис on 09/11/17.
 */
public class MakerTask {
    public Task createTask() throws IOException, ParseException {
        Task task = new Task();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strTemp;
        StringBuffer sb = new StringBuffer();
        System.out.println("Введите название задачи");
        task.setTheme(br.readLine().trim());
        System.out.println("Введите дату (дд.мм.гггг)");

        SimpleDateFormat sdf = new SimpleDateFormat("hh.mm dd.MM.yyyy");
        strTemp = br.readLine();
        System.out.println("Введите время начала");
        task.setTimeBegin(br.readLine());
        sb.append(task.getTimeBegin()).append(' ').append(strTemp);
        System.out.println("Введите время окончания");
        task.setTimeEnd(br.readLine());

        task.setDate(sdf.parse(sb.toString()));

        sb.delete(0, sb.length());

        System.out.println("Введите описание задачи\nДля окончания ввода введите \"стоп\"");
        while (true) {
            strTemp = br.readLine().trim();
            if (!strTemp.toLowerCase().equals("стоп")) {
                sb.append(strTemp).append("\n");
            }
            else {
                break;
            }
        }
        task.setDescription(sb.toString());
        return task;
    }
}

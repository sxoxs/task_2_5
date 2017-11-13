package com.company;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

/**
 * Created by Денис on 09/11/17.
 */
public class ListTask {
    private ArrayList<Task> taskList = new ArrayList<>();
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Task> getTaskList() {
        return taskList;
    }

    public void addTask () throws IOException, ParseException {
        MakerTask mt = new MakerTask();
        taskList.add(mt.createTask());
    }

    public void removeTask (Task task) {
        taskList.remove(task);
    }

    public void outTask (int index) {
        System.out.println(taskList.get(index).toString());
    }

}

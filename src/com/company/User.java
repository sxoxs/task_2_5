package com.company;

import java.util.ArrayList;

/**
 * Created by Денис on 09/11/17.
 */
public class User {
    private String name;
    private ArrayList<ListTask> lists = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void createList (String name) {
        ListTask list = new ListTask();
        list.setName(name);
        lists.add(list);
    }

    public void removeList (String name) {
        for (ListTask list : lists) {
            if (list.getName().equals(name)) {
                lists.remove(list);
            }
        }
    }

    public ArrayList<ListTask> getLists() {
        return lists;
    }
}

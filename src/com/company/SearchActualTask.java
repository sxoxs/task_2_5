package com.company;

import java.util.Date;

/**
 * Created by Денис on 10/11/17.
 */
public class SearchActualTask {

    public boolean containsActualTask (ListTask listTask, Date dateBegin, Date dateEnd) {
        for (Task task : listTask.getTaskList()){
            if ( (task.getDate().after(dateBegin)) && (task.getDate().before(dateEnd)) ){
                return true;
            }
        }

        return false;
    }

    public void outActtualTask(ListTask listTask, Date dateBegin, Date dateEnd) {
        for (Task task : listTask.getTaskList()){
            if ( (task.getDate().after(dateBegin)) && (task.getDate().before(dateEnd)) ){
                System.out.println(task.toString());
            }
        }
    }
}

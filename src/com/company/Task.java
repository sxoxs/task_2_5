package com.company;

import java.util.Date;

/**
 * Created by Денис on 09/11/17.
 */
public class Task {
    private String theme;
    private String description;
    private String timeBegin;
    private String timeEnd;
    private Date date;

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTimeBegin() {
        return timeBegin;
    }

    public void setTimeBegin(String timeBegin) {
        this.timeBegin = timeBegin;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Задача: ");
        sb.append(theme).append('\n');
        sb.append(description);
        sb.append(Integer.toString(date.getDate())).append('.')
                .append(date.getMonth()).append('.')
                .append(date.getYear());
        sb.append(" начало: ").append(timeBegin).append(',');
        sb.append(" окончание: ").append(timeEnd).append('.');
        return sb.toString();
    }
}

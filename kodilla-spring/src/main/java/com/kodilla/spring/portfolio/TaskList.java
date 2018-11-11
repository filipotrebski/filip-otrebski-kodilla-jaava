package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;


public final class TaskList {
    private final List<String> taskList;

    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    public List<String> getTaskList() {
        return taskList;
    }
}

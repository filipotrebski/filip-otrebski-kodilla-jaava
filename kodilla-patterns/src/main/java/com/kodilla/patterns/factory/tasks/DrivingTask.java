package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task{
    final private String taskName;
    final private String where;
    final private String using;
    private boolean isDone = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        if(!isDone) {
            System.out.println(toString());
            isDone = true;
        }
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isDone;
    }

    public String getUsing() {
        return using;
    }

    public String getWhere() {
        return where;
    }

    @Override
    public String toString() {
        return "DrivingTask: taskName= " + taskName + ", where: " + where + ", using='" + using + " is executing now";
    }
}

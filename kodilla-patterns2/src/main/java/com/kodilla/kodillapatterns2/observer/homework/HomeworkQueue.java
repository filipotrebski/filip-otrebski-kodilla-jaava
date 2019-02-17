package com.kodilla.kodillapatterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworkQueue implements Observable{
    private final List<Observer> mentors;
    private final List<String> tasks;
    private final String student;

    public HomeworkQueue(String student) {
        this.student = student;
        this.mentors = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    public void addTasks(String task){
        tasks.add(task);
        notifyObservers();
    }


    @Override
    public void registerObservers(Observer observer) {
        mentors.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer mentor : mentors){
            mentor.update(this);
        }
    }

    @Override
    public void removeObservers(Observer observer) {
        mentors.remove(observer);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getStudent() {
        return student;
    }
}

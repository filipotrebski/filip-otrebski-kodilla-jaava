package com.kodilla.kodillapatterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int counter;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(HomeworkQueue queue) {
        System.out.println("Student " + queue.getStudent() + " homework has been added to queue" +
                "\n Homework's in the queue:  "+ queue.getTasks().size());
        queue.getTasks().stream().forEach(System.out::println);
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}

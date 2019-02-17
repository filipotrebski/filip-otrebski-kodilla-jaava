package com.kodilla.kodillapatterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class MentorTestSuite {

    @Test
    public void testUpdate() {
        //Given
        HomeworkQueue alexandersTasks = new HomeworkQueue("Alexander");
        HomeworkQueue johnTasks = new HomeworkQueue("John");
        HomeworkQueue annTasks = new HomeworkQueue("Ann");
        HomeworkQueue jamesTasks = new HomeworkQueue("James");
        Mentor plato = new Mentor("Plato");
        Mentor aristotle = new Mentor("Aristotle");
        alexandersTasks.registerObservers(plato);
        alexandersTasks.registerObservers(aristotle);
        johnTasks.registerObservers(plato);
        annTasks.registerObservers(plato);
        jamesTasks.registerObservers(aristotle);
        jamesTasks.registerObservers(plato);
        //When
        alexandersTasks.addTasks("Task1 solved");
        alexandersTasks.addTasks("Task 3 done");
        jamesTasks.addTasks("Task 10 solved");
        annTasks.addTasks("Task 3 solved");
        johnTasks.addTasks("Task 15 solved");
        //Then
        assertEquals(5,plato.getCounter());
        assertEquals(3,aristotle.getCounter());
    }
}
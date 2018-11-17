package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testDrivingTaskFactory(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.createTask(TaskFactory.DRIVING);
        task.executeTask();
        //Then
        Assert.assertEquals("Trip",task.getTaskName());
        Assert.assertTrue(task.isTaskExecuted());
    }

    @Test
    public void testPaintingTaskFactory(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.createTask(TaskFactory.PAINTING);
        task.executeTask();
        //Then
        Assert.assertEquals("Paint job",task.getTaskName());
        Assert.assertTrue(task.isTaskExecuted());
    }

    @Test
    public void testShoppingTaskFactory(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.createTask(TaskFactory.SHOPINNG);
        task.executeTask();
        //Then
        Assert.assertEquals("Daily shopping",task.getTaskName());
        Assert.assertTrue(task.isTaskExecuted());
    }

}

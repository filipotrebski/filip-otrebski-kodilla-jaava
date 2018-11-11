package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);
        String task = "ToDo task added";
        String task1 = "InProgress task added";
        String task2 ="Done task added";
        //When
        board.getToDoList().getTaskList().add(task);
        board.getInProgressList().getTaskList().add(task1);
        board.getDoneList().getTaskList().add(task2);
        //Then
        System.out.println(board.getToDoList().getTaskList().get(0));
        System.out.println(board.getInProgressList().getTaskList().get(0));
        System.out.println(board.getDoneList().getTaskList().get(0));
    }
}

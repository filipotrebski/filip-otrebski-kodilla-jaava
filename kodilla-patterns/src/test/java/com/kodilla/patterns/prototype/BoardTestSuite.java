package com.kodilla.patterns.prototype;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class BoardTestSuite {
    @Test
    public void testToString() {
        //Given
        //creating the TaskList for todos
        TasksList listToDO = new TasksList("To Do Tasks");
        IntStream.iterate(1, n -> n + 1).limit(10)
                .forEach(n -> listToDO.getTasks().add(new Task("To Do Task number" + n)));

        //creating the TaskList for task in progress
        TasksList listInProgress = new TasksList("In Progress Task");
        IntStream.iterate(1, n -> n + 1).limit(10)
                .forEach(n -> listInProgress.getTasks().add(new Task("In Progress Task number: " + n)));

        //creating the TaskList for done tasks
        TasksList listDone = new TasksList("Done Tasks");
        IntStream.iterate(1, n -> n + 1).limit(10)
                .forEach(n -> listDone.getTasks().add(new Task("Done Task number: " + n)));

        //creating board and assigning the lists
        Board board = new Board("Project number 1");
        board.getLists().add(listToDO);
        board.getLists().add(listInProgress);
        board.getLists().add(listDone);

        //making shallow clone of object board
        Board clonedBoard = null;
        try {
            clonedBoard = board.shallowCopy();
            clonedBoard.setName("Project number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making deep clone of object board
        Board deepClonedBoard = null;
        try {
            deepClonedBoard = board.deepCopy();
            deepClonedBoard.setName("Project number 3");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //When
        board.getLists().remove(listToDO);

        //Then
        System.out.println(board);
        System.out.println(clonedBoard);
        System.out.println(deepClonedBoard);
        Assert.assertEquals(2, board.getLists().size());
        Assert.assertEquals(2, clonedBoard.getLists().size());
        Assert.assertEquals(3,deepClonedBoard.getLists().size());
        Assert.assertEquals(clonedBoard.getLists().size(),board.getLists().size());
        Assert.assertNotEquals(deepClonedBoard.getLists().size(),board.getLists().size());
    }
}

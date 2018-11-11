package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("todo")
    TaskList toDoList;

    @Autowired
    @Qualifier("inprogress")
    TaskList inProgressList;

    @Autowired
    @Qualifier("done")
    TaskList doneList;

    @Bean
    public Board getBoard(){
        return new Board(toDoList,inProgressList,doneList);
    }

    @Bean(name = "todo")
    public TaskList getToDoList() {
        return new TaskList();
    }

    @Bean(name = "inprogress")
    public TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean(name = "done")
    public TaskList getDoneList() {
        return new TaskList();
    }


}

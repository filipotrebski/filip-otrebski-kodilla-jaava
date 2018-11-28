package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "To do list";
    private static final String LISTNAME = "ToDo";

    @Test
    public void testFindByListName() {
        //Given
        TaskList list = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(list);

        //When
        List<TaskList> resultList = taskListDao.findByListName(LISTNAME);

        //Then
        String name = resultList.get(0).getListName();
        Assert.assertEquals(1, resultList.size());
        Assert.assertEquals(LISTNAME, name);

        //Clean up
        int id = resultList.get(0).getId();
        taskListDao.delete(id);
    }
}

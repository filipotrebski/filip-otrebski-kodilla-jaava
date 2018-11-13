package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {



    @Test
    public void testLog(){
        //Given
        //When
        Logger.getInstance().log("This is the log");
        //Then
        Assert.assertEquals("This is the log",Logger.getInstance().getLastLog());
    }
}

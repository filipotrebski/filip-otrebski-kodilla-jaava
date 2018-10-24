package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] testArray = {3,5,4,2,5,3,2,4,5,4,4,3,6};
        //When
        double average = ArrayOperations.getAverage(testArray);
        //Then
        Assert.assertEquals(3.846, average,0.0002);
    }
}

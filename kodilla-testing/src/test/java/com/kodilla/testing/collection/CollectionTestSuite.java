package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> emptyList = new ArrayList<>();
        //When
        boolean isListSizeNull = oddNumbersExterminator.exterminate(emptyList).isEmpty();
        System.out.println("Testing empty list ");
        //Then
        Assert.assertTrue(isListSizeNull);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> someList = new ArrayList<>();
        List<Integer> testRefeence = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        for (int i = 0; i < 101; i++) {
            someList.add(i);
            if(i%2== 0){
                testRefeence.add(i);
            }
        }
        List<Integer> evenList = oddNumbersExterminator.exterminate(someList);
        System.out.println("Testig if numbers on the list are even");
        //When
        boolean isNumbersOnTheListAreEven = true;
        for (int i = 0; i < evenList.size();i++){
            isNumbersOnTheListAreEven = evenList.get(i).equals(testRefeence.get(i));
            if (!isNumbersOnTheListAreEven){
                break;
            }
        }
        /*for (int i = 0; i < evenList.size();i++){
            if (!testRefeence.contains(evenList.get(i))){
                isNumbersOnTheListAreEven = false;
                break;
            }
        }*/
        //Then
        Assert.assertTrue(isNumbersOnTheListAreEven);
    }

}

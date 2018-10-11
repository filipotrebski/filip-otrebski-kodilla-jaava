package com.kodilla.testing;

import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.ArrayList;
import java.util.List;

public class TestingMain {

    public static void main(String[] args) {
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> someList = new ArrayList<>();
        for (int i= 0; i < 15; i++){
            someList.add(i);
        }
        List<Integer> evenList = oddNumbersExterminator.exterminate(someList);

        for (Integer myInt : evenList){
            System.out.println(myInt);
        }

    }
}

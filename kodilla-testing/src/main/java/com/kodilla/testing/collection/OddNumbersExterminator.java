package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    //działa ale czy tak się robi?
    public List<Integer> exterminate(List<Integer> integersList) {
        List<Integer> evenIntList = new ArrayList<>();

        for (Integer evenInt : integersList) {
            if (evenInt % 2 == 0) {
                evenIntList.add(evenInt);
            }

        }
        return evenIntList;

    }

}

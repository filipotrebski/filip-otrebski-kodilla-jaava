package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers){
        IntStream.range(0,numbers.length).forEach(x -> System.out.println(numbers[x]));
        //IntStream intStream = Arrays.stream(numbers);
        OptionalDouble average = IntStream.range(0,numbers.length).map(x -> numbers[x] ).average();

        return average.getAsDouble();
    }
}

package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {
    public void readFile() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("file/names.txt").getFile());
        //Path path = Paths.get(file.getPath());
        try (Stream<String> fileLines = Files.lines(Paths.get("files/ddd.txt"))) {

            fileLines.forEach(System.out::println);

        } catch (IOException e) {

            System.out.println("Oh no! Something went wrong. Error :" + e);

        } finally {

            System.out.println("I'm gonna be here... always");
        }

        System.out.println(file.getPath());
    }
}

package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given
        Book book1 = new Book("Snowcrash","Neal Stephenson", LocalDate.of(2000,1,1));
        Book book2 = new Book("Abbadon's Gate: Book 3 of the Expanse", "James S.A. Corey",LocalDate.of(2013,8,25));
        Book book3 = new Book("Altered carbon", "Richard Morgan", LocalDate.of(2002,5,5));

        //creating library and adding book to the list
        Library library = new Library("Original Library");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //create shallow copy of Library
        Library shallowClone = null;
        try {
            shallowClone = library.shallowCopy();
            shallowClone.setName("Shallow cloned library");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //creating deep clone of the library
        Library deepClone = null;
        try {
            deepClone = library.deepCopy();
            deepClone.setName("Deep cloned library");
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        //When
        library.getBooks().remove(book2);

        //Then
        System.out.println(library);
        System.out.println(shallowClone);
        System.out.println(deepClone);
        Assert.assertEquals(2,library.getBooks().size());
        Assert.assertEquals(2,shallowClone.getBooks().size());
        Assert.assertEquals(3,deepClone.getBooks().size());
    }
}

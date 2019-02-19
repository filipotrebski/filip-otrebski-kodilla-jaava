package com.kodilla.kodillapatterns2.adapter.bookclasifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class MedianAdapterTestSuite {

    @Test
    public void testPublicationYearMedian() {
        //Given
        Book book = new Book("Frank Herbert", "Dune", 1965,"01010101");
        Book book1 = new Book("George R.R. Martin", "A Game of thrones", 1996,"10101010");
        Book book2 = new Book("Glenn Cook", "The Black Company",1984,"12334566");
        Book book3 =new Book("James S.A. Corey", "Leviathan wakes",2010,"9999999");
        Book book4 = new Book("Richard Morgan", "Altered Carbon",2002,"78945613");
        MedianAdapter adapter = new MedianAdapter();

        Set<Book> books = new HashSet<>();
        books.add(book);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        //When
        int result = adapter.publicationYearMedian(books);
        //Then
        assertEquals(1996,result);
    }
}
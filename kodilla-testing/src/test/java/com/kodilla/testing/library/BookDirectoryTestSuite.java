package com.kodilla.testing.library;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {
    @Test
    public void testListBooksWithConditionsReturnList() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = bookLibrary.listBookWithCondition("Secret");

        //Then
        assertEquals(4, theListOfBooks.size());

    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks0 = new ArrayList<>(); // pusta lista - bez książek
        List<Book> resultListOfBooks15 = generateListOfNBooks(15); // 15 ksiązek na lisćie
        List<Book> resultListOfBooks40 = generateListOfNBooks(40); // tu 40
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOfBooks15);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOfBooks0);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOfBooks40);

        //When
        List<Book> theListOfBooks0 = bookLibrary.listBookWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBookWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBookWithCondition("FortyBooks");

        //Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThen3() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf10Books);

        //When
        List<Book> theListOfBooks10 = bookLibrary.listBookWithCondition("An");

        //Then
        assertEquals(0, theListOfBooks10.size());
        //verify(czy MOCK została wykonana n razy [times(n)] metoda metodaMocka(z argumentem)
        // times(n),never(), atLeastOnce(), atLeast(n), atMost(n) <- inne możliwości
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());

    }

    @Test
    public void testListOfBooksInHandsOfZeroBooks() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user = new LibraryUser("first", "last", "12345678901");
        List<Book> resultList = new ArrayList<>();
        when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(resultList);
        //Then
        List<Book> theListOfUsersBook0 = bookLibrary.listOfBooksInHandsOf(user);
        //When
        Assert.assertEquals(0, theListOfUsersBook0.size());
        verify(libraryDatabaseMock, times(1)).listBooksInHandsOf(user);
    }

    @Test
    public void testListOfBooksInHandsOfOneBook() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user = new LibraryUser("first", "last", "12345678901");
        List<Book> resultList = generateListOfNBooks(1);
        when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(resultList);
        //Then
        List<Book> theListOfUsersBooks1 = bookLibrary.listOfBooksInHandsOf(user);
        //When
        Assert.assertEquals(1, theListOfUsersBooks1.size());
        verify(libraryDatabaseMock, times(1)).listBooksInHandsOf(user);
    }

    @Test
    public void testListOfBooksInHandsOfOneBooks5() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user = new LibraryUser("first", "last", "12345678901");
        List<Book> resultList = generateListOfNBooks(5);
        when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(resultList);
        //When
        List<Book> theListOfUsersBooks5 = bookLibrary.listOfBooksInHandsOf(user);
        //Then
        Assert.assertEquals(5, theListOfUsersBooks5.size());
    }

    private List<Book> generateListOfNBooks(int bookQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= bookQuantity; n++) {
            Book theBook = new Book("Title" + n, "Author" + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }
}

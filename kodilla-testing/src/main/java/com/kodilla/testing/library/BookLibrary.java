package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBookWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<>();
        if (titleFragment.length() < 3) {
            return bookList;
        }
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) {
            return bookList;
        }
        bookList = resultList;
        return bookList;
    }

    //do prze[isania?
    public List<Book> listOfBooksInHandsOf(LibraryUser libraryUser) {
        List<Book> userBooksList = new ArrayList<>();
        userBooksList = libraryDatabase.listBooksInHandsOf(libraryUser);

        return userBooksList;
    }
}

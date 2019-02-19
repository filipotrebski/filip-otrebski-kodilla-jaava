package com.kodilla.kodillapatterns2.adapter.bookclasifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature,com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.Book> bookMap = new HashMap<>();
        for (Book book : bookSet){
            com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.Book bookB = new com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.Book(
                    book.getAuthor(),
                    book.getTitle(),
                    book.getPublicationYear()
            );
            BookSignature signature = new BookSignature(book.getSignature());
            bookMap.put(signature,bookB);
        }
        return medianPublicationYear(bookMap);
    }

}

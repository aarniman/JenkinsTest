package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List books = new ArrayList<String>();

    public void addBook(String book) {
        books.add(book);
    }

    public void removeBook(String book) {
        books.remove(book);
    }

    public List listBooks() {
        return books;
    }
}

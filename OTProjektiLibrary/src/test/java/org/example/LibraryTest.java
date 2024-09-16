package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;

public class LibraryTest {

    @org.junit.jupiter.api.Test
    public void testAddAndListBooks() {
        Library library = new Library();
        library.addBook("The Great Gatsby");
        List<String> books = library.listBooks();
        assertEquals(String.valueOf(1), books.size(), "There should be 1 book in the library");
        assertEquals("The Great Gatsby", books.get(0), "The Great Gatsby");
    }

    @Test
    public void testRemoveBook() {
        Library library = new Library();
        library.addBook("1984");
        library.removeBook("1984");
        List<String> books = library.listBooks();
        assertEquals(String.valueOf(0), books.size(), "There should be no books in the library");
    }

}
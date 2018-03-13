package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookManagementTest {

    List<Book> allBooksExpected;

    @Before
    public void setup(){
        allBooksExpected = new ArrayList();

        Book book1 = new Book("Book one", "Author one", 2010);
        Book book2 = new Book("Book two", "Author two", 2011);
        Book book3 = new Book("Book three", "Author three", 2012);

        allBooksExpected.add(book1);
        allBooksExpected.add(book2);
        allBooksExpected.add(book3);
    }


    @Test
    public void showAllBooksAvailable(){
        BookManagement bookManagement = new BookManagement();
        List<Book> allBooks = bookManagement.getAllBooksAvailable();
        assertEquals(allBooksExpected, allBooks);
    }

    @Test
    public void successfulCheckout(){
        BookManagement bookManagement = new BookManagement();

        String status = bookManagement.checkoutBook("Book one");

        assertEquals(status, "Thank you! Enjoy the book");
    }

    @Test
    public void unsuccessfulCheckout(){
        BookManagement bookManagement = new BookManagement();

        String status = bookManagement.checkoutBook("Book four");

        assertEquals(status, "That book is not available");
    }

    @Test
    public void successfulReturn(){
        BookManagement bookManagement = new BookManagement();

        String message = bookManagement.returnBook("Book one");

        assertEquals(message, "Thank you for returning the book");
    }

    @Test
    public void unsuccessfulReturn(){
        BookManagement bookManagement = new BookManagement();

        String message = bookManagement.returnBook("Book");

        assertEquals(message, "That is not a valid book to return");
    }

    @Test
    public void validateFindARightBook(){
        BookManagement bookManagement = new BookManagement();
        Book bookExpected = new Book("Book one", "Author one", 2010);

        Book bookReturned = bookManagement.findBook(bookExpected.getName());

        assertEquals(bookExpected, bookReturned);
    }

    @Test
    public void validateFindAWrongBook(){
        BookManagement bookManagement = new BookManagement();
        Book bookExpected = new Book("Book", "Author", 2010);

        Book bookReturned = bookManagement.findBook(bookExpected.getName());

        assertEquals(null, bookReturned);
    }
}

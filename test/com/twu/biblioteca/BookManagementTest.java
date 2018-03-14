package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookManagementTest {

    List<Item> allBooksExpected;

    @Before
    public void setup(){
        allBooksExpected = new ArrayList<Item>();

        allBooksExpected.add(new Book("Book one", "Author one", 2010));
        allBooksExpected.add(new Book("Book two", "Author two", 2011));
        allBooksExpected.add(new Book("Book three", "Author three", 2012));
    }

    @Test
    public void showAllBooksAvailable(){
        BookManagement bookManagement = new BookManagement();
        List<Item> allBooks = bookManagement.getAllAvailableItens();
        assertEquals(allBooksExpected, allBooks);
    }

    @Test
    public void successfulCheckOut(){
        BookManagement bookManagement = new BookManagement();

        String status = bookManagement.checkOutItem("Book one");

        assertEquals(status, "Thank you! Enjoy it");
    }

    @Test
    public void unsuccessfulCheckOut(){
        BookManagement bookManagement = new BookManagement();

        String status = bookManagement.checkOutItem("Book four");

        assertEquals(status, "That item is not available");
    }

    @Test
    public void successfulReturn(){
        BookManagement bookManagement = new BookManagement();

        String message = bookManagement.returnItem("Book one");

        assertEquals(message, "Thank you for returning the item");
    }

    @Test
    public void unsuccessfulReturn(){
        BookManagement bookManagement = new BookManagement();

        String message = bookManagement.returnItem("Book");

        assertEquals(message, "That is not a valid item to return");
    }

    @Test
    public void validateFindARightBook(){
        BookManagement bookManagement = new BookManagement();
        Book bookExpected = new Book("Book one", "Author one", 2010);

        Item bookReturned = bookManagement.findItem(bookExpected.getName());

        assertEquals(bookExpected, bookReturned);
    }

    @Test
    public void validateFindAWrongBook(){
        BookManagement bookManagement = new BookManagement();
        Book bookExpected = new Book("Book", "Author", 2010);

        Item bookReturned = bookManagement.findItem(bookExpected.getName());

        assertEquals(null, bookReturned);
    }
}

package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BookManagement {
    private List<Book> allBooks;

    public BookManagement(){
        allBooks = new ArrayList<Book>();

        Book book1 = new Book("Book one", "Author one", 2010);
        Book book2 = new Book("Book two", "Author two", 2011);
        Book book3 = new Book("Book three", "Author three", 2012);
        Book book4 = new Book("Book four", "Author four", 2013);

        book4.setAvailable(false);

        allBooks.add(book1);
        allBooks.add(book2);
        allBooks.add(book3);
        allBooks.add(book4);
    }

    public List<Book> getAllBooksAvailable() {
        List<Book> booksAvailable = new ArrayList<Book>();

        for (Book book : allBooks) {
            if (book.isAvailable()){
                booksAvailable.add(book);
            }
        }

        return booksAvailable;
    }

    public String checkoutBook(String bookToCheckOut) {

        Book book = findBook(bookToCheckOut);

        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
            return "Thank you! Enjoy the book";
        } else {
            return "That book is not available";
        }
    }

    public String returnBook(String bookToReturn) {

        Book book = findBook(bookToReturn);

        if (book != null) {
            book.setAvailable(true);
            return "Thank you for returning the book";
        } else {
            return "That is not a valid book to return";
        }
    }

    public Book findBook(String name) {

        for (Book book : allBooks) {
            if (book.getName().equalsIgnoreCase(name))
                return book;
        }

        return null;
    }
}

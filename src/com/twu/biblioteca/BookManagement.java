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

        allBooks.add(book1);
        allBooks.add(book2);
        allBooks.add(book3);
    }

    public List<Book> getAllBooks() {
        return allBooks;
    }

    public String checkoutBook(Book book) {
        if (book.isAvailable()){
            book.setAvailable(false);
            return "Thank you! Enjoy the book";
        }
        return "That book is not available";
    }

    public String returnBook(String bookToReturn) {
        for (Book book : allBooks){
            if(book.getName().equalsIgnoreCase(bookToReturn)){
                book.setAvailable(true);
                return "Thank you for returning the book";
            }
        }
        return "That is not a valid book to return";
    }
}

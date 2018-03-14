package com.twu.biblioteca;

import java.util.ArrayList;

public class BookManagement extends ItemManagement{
    

    public BookManagement(){
        allItens = new ArrayList<Item>();

        Book book = new Book("Book four", "Author four", 2013);
        book.setAvailable(false);

        allItens.add(new Book("Book one", "Author one", 2010));
        allItens.add(new Book("Book two", "Author two", 2011));
        allItens.add(new Book("Book three", "Author three", 2012));
        allItens.add(book);
    }
}

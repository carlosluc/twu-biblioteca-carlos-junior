package com.twu.biblioteca;

public class Book extends Item {

    private String author;

    public Book(String name, String author, int yearPublished){
        this.name = name;
        this.author = author;
        this.year = yearPublished;
        this.isAvailable = true;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object book) {

        if (getName().equalsIgnoreCase(((Book) book).getName()))
            if(getAuthor().equalsIgnoreCase(((Book) book).getAuthor()))
                if (this.getYear() == ((Book) book).getYear())
                    return true;

        return false;
    }
}

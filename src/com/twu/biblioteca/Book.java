package com.twu.biblioteca;

public class Book {

    private String name;
    private String author;
    private int yearPublished;
    private boolean isAvailable;

    public Book(String name, String author, int yearPublished){
        this.name = name;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isAvailable = true;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public boolean equals(Object book) {

        if (getName().equalsIgnoreCase(((Book) book).getName()))
            if(getAuthor().equalsIgnoreCase(((Book) book).getAuthor()))
                if (getYearPublished() == ((Book) book).getYearPublished())
                    return true;

        return false;
    }
}

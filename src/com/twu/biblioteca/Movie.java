package com.twu.biblioteca;

public class Movie extends Item{

    private String director;
    private String rating;

    public Movie(String name, String director, int year, String rating) {
        this.name = name;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.isAvailable = true;
    }

    public String getDirector() {
        return director;
    }

    public String getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object movie) {

        if (getName().equalsIgnoreCase(((Movie) movie).getName()))
            if(getDirector().equalsIgnoreCase(((Movie) movie).getDirector()))
                if (getYear() == ((Movie) movie).getYear())
                    if(getRating().equalsIgnoreCase(((Movie) movie).getRating()))
                        return true;
        return false;
    }
}

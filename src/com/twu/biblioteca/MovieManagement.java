package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class MovieManagement extends ItemManagement {

    public MovieManagement(){
        allItens = new ArrayList<Item>();

        Movie movie = new Movie("Movie four", "Director four", 2013, "7");
        movie.setAvailable(false);

        allItens.add(new Movie("Movie one", "Director one", 2010, "10"));
        allItens.add(new Movie("Movie two", "Director two", 2011, "5"));
        allItens.add(new Movie("Movie three", "Director three", 2012, ""));
        allItens.add(movie);
    }

}

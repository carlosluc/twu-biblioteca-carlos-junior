package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MovieManagementTest{

    List<Item> allExpectedMovies;

    @Before
    public void setuo(){
        Movie movie = new Movie("Movie four", "Director four", 2013, "7");

        movie.setAvailable(false);

        allExpectedMovies = new ArrayList<Item>();

        allExpectedMovies.add(new Movie("Movie one", "Director one", 2010, "10"));
        allExpectedMovies.add(new Movie("Movie two", "Director two", 2011, "5"));
        allExpectedMovies.add(new Movie("Movie three", "Director three", 2012, ""));
    }

    @Test
    public void showAllMoviesAvailable(){
        MovieManagement movieManagement = new MovieManagement();

        List<Item> allAvailableMovies = movieManagement.getAllAvailableItens();

        assertEquals(allExpectedMovies, allAvailableMovies);
    }

    @Test
    public void successfulCheckOut(){
        MovieManagement movieManagement = new MovieManagement();

        String status = movieManagement.checkOutItem("Movie one");

        assertEquals(status, "Thank you! Enjoy it");
    }

    @Test
    public void unsuccessfulCheckOut(){
        MovieManagement movieManagement = new MovieManagement();

        String status = movieManagement.checkOutItem("Movie four");

        assertEquals(status, "That item is not available");
    }

    @Test
    public void successfulReturn(){
        MovieManagement movieManagement = new MovieManagement();

        String message = movieManagement.returnItem("Movie one");

        assertEquals(message, "Thank you for returning the item");
    }

    @Test
    public void unsuccessfulReturn(){
        MovieManagement movieManagement = new MovieManagement();

        String message = movieManagement.returnItem("Book");

        assertEquals(message, "That is not a valid item to return");
    }


    @Test
    public void validateFindARightMovie(){
        MovieManagement movieManagement = new MovieManagement();
        Movie movieExpected = new Movie("Movie one", "Director one", 2010, "10");

        Item movieReturned = movieManagement.findItem(movieExpected.getName());

        assertEquals(movieExpected, movieReturned);
    }

    @Test
    public void validateFindAWrongMovie(){
        MovieManagement movieManagement = new MovieManagement();
        Movie movieExpected = new Movie("Movie", "Director one", 2010, "10");

        Item movieReturned = movieManagement.findItem(movieExpected.getName());

        assertEquals(null, movieReturned);
    }
}

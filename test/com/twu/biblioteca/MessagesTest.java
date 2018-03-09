package com.twu.biblioteca;

import org.junit.Test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MessagesTest {

    @Test
    public void validateWelcomeMessage() {

        String expectedWelcomeMessage = "Welcome to the Biblioteca!";

        Messages messages = new Messages();
        String welcomeMessage = messages.getWelcomeMessage();

        assertEquals(expectedWelcomeMessage, welcomeMessage);
    }

    @Test
    public void validateMainMenu(){

        String mainMenuExpected = "1- List Books";

        Messages messages = new Messages();
        String mainMenu = messages.getMainMenu();

        assertEquals(mainMenuExpected, mainMenu);
    }


}

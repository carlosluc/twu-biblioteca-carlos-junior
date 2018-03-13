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
        String mainMenuExpected = "1- List Available Books\n2- Check out a book\n3- Return a book";

        Messages messages = new Messages();
        String mainMenu = messages.getMainMenu();

        assertEquals(mainMenuExpected, mainMenu);
    }

    @Test
    public void validateInvalidOptionMainMenu(){
        String expectedInvalidOptionMessage = "Select a valid option!";

        Messages messages = new Messages();
        String invalidOptionMessage = messages.getInvalidOptionMessage();

        assertEquals(expectedInvalidOptionMessage, invalidOptionMessage);
    }

    @Test
    public void validateInstructionMessageMainMenu(){
        String expectedInstructionMessageMainMenu = "Type the item's number or Q to quit:";

        Messages messages = new Messages();
        String instructionMessageMainMenu = messages.getInstructionMessageMainMenu();

        assertEquals(expectedInstructionMessageMainMenu, instructionMessageMainMenu);
    }
}

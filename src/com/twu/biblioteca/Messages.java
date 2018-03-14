package com.twu.biblioteca;

public class Messages {

    public String getWelcomeMessage() {
        return "Welcome to the Biblioteca!";
    }

    public String getMainMenu() {
        return "1- List Available Books\n2- Check out a book\n3- Return a book";
    }

    public String getInvalidOptionMessage() {
        return "Select a valid option!";
    }

    public String getInstructionMessageMainMenu() {
        return "Type the item's number or Q to quit:";
    }
}
package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        showWelcomeMessage();

        showMainMenu();

    }

    private static void showWelcomeMessage() {
        Messages messages = new Messages();
        String welcomeMessage = messages.getWelcomeMessage();
        System.out.println(welcomeMessage);
    }

    private static void showMainMenu() {
        Messages messages = new Messages();
        String mainMenu = messages.getMainMenu();
        System.out.println(mainMenu);

        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        System.out.println("Type the item's number or Q to quit:");

        while (userInput != "q") {
            userInput = scanner.nextLine();

            if(userInput == "1"){

            }
        }

    }
}

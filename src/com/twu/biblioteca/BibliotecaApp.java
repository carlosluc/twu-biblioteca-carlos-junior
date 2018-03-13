package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    private static BookManagement bookManagement;

    public static void main(String[] args) {

        bookManagement = new BookManagement();

        showWelcomeMessage();

        mainMenu();
    }

    private static void showWelcomeMessage() {
        Messages messages = new Messages();
        String welcomeMessage = messages.getWelcomeMessage();
        System.out.println("\n"+welcomeMessage+"\n");
    }

    private static void mainMenu() {
        String userInput = "";

        showMainMenu();

        while (!(userInput = getUserInput()).equalsIgnoreCase("q")) {

            System.out.print("\n");

            if(userInput.equals("1")){
                showAllAvailableBooks();
            } else {
                if(userInput.equals("2")){
                    checkOutABook();
                } else {
                    if(userInput.equals("3")){
                        returnABook();
                    } else {
                        Messages messages = new Messages();
                        System.out.println(messages.getInvalidOptionMessage());
                    }
                }
            }

            System.out.print("\n");

            showMainMenu();
        }
    }

    private static void showMainMenu(){
        Messages messages = new Messages();

        System.out.println(messages.getMainMenu());
        System.out.println(messages.getInstructionMessageMainMenu());
    }

    private static String getUserInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void showAllAvailableBooks() {
        List<Book> listAvailableBooks = bookManagement.getAllBooksAvailable();

        System.out.println("Name\t\t|\tAuthor\t\t|\tYear Published\n");

        for (Book book : listAvailableBooks) {
            String line = book.getName()+"\t\t"+book.getAuthor()+"\t\t"+book.getYearPublished();
            System.out.println(line);
        }
    }

    private static void checkOutABook() {
        System.out.println("Please, type the name of the book that you will check out:");
        String userInput = getUserInput();

        System.out.println(bookManagement.checkoutBook(userInput));
    }

    private static void returnABook() {
        System.out.println("Please, type the name of the book that you will return:");
        String userInput = getUserInput();

        System.out.println(bookManagement.returnBook(userInput));
    }


}

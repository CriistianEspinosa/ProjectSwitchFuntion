package com.example.projectswitchfunction;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;
public class HelloApplication {
    public static void main(String [] args) {

    Scanner scanner = new Scanner(System.in);

    printAnyString("Hi you are the best program, the program has some options such as: A, B and C");

    printAnyString("Please type any option");
    String readingString = scanner.nextLine();
    switch (readingString.toLowerCase()) {

        case "a":
            printAnyString("Now you are in sum program, it is necessary to type two numbers, let us go");
            printAnyString("Typing the first number");
            int numberOne = scanner.nextInt();

            printAnyString("Typing the first number");
            int numberTwo = scanner.nextInt();

            int sumResult = sumNumbers(numberOne,numberTwo);
            printAnyString("The result of sum is: " +sumResult);

            break;

        case "b":
            printAnyString("The program return the text do you enter");
            printAnyString("");
            String emptyString = scanner.nextLine();
            String writtenString = resultstring(emptyString);
            printAnyString("The string is: " +writtenString);

            break;

        case "c":

    }

    }
    public static void printAnyString(String message){
        System.out.println(message);
    }

    public static int sumNumbers(int numberOne, int numberTwo) {
        int result = numberOne + numberTwo;
        return result;

        // Another way: return numberOne + numberTwo;
    }
    public static String resultstring (String emptyString) {
        String resultString = (emptyString);
        return resultString;
    }



}
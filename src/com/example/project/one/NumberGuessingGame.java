package com.example.project.one;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void guessingNumberGame(){

        Scanner sc = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter low number");
        int min = sc.nextInt();  // Read user input
        System.out.println("Enter high number");
        int max = sc.nextInt();  // Read user input

        System.out.println("User entered low number: " + min + " and high number: " + max);

//        generate random number
        Random rand = new Random();
        int randomNumber = rand.nextInt(max-min) + min;
        System.out.println(randomNumber + " this is random number");

        int tries = 10;
        if (randomNumber >= 10){
            tries = tries/2;
        }
        System.out.println("A number is chosen between 0 & " + max );

        int i = 0, guess;

        for (i = 0; i<tries; i++){
            println("Guess the number: ");
            guess = sc.nextInt();

            if (guess == randomNumber){
                println("great");
                break;
            }else if (randomNumber > guess && i != tries-1){
                println("The number is greater than " + guess);
            }else if (randomNumber < guess && i != tries-1){
                println("THe number is less than " + guess);
            }

            if (guess == tries){
                println(" you have used all your chances: \n the number is " + randomNumber);
            }

        }
    }

    public static void println(Object line){
        System.out.println(line);
    }

    public static void main(String[]args){
        guessingNumberGame();
    }
}

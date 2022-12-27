package com.example.project.one;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class TimerCountdown {
    public static void main(String[] args){
        System.out.println("----------------Countdown Timer-------------");
        Thread countdownThread = new Thread(new Runnable(){
            @Override
                public void run() {
                Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Enter Countdown Time ");

                Integer userName = myObj.nextInt();  // Read user input
//                System.out.println("Username is: " + userName);

                for (int i = userName; i >= 0; i--) {
                    System.out.print(i + "sec ");
                    try {
                        Thread.sleep(1000);
//                        System.out.flush();
//                        Runtime.getRuntime().exec("cls");
//                        Runtime.getRuntime().exec("clear");
//                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();/
//                        Runtime.getRuntime(). exec("cls");
                        String[] cls = new String[] {"cmd.exe", "/c", "cls"};
                        Runtime.getRuntime().exec(cls);
                    } catch (Exception e) {
                        System.out.println("Error : " + e);
                    }
                }
                System.out.println("\nFinished!!!");
            }
        });
        countdownThread.start();
    }
}

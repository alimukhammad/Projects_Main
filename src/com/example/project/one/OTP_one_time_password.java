package com.example.project.one;

import java.util.Random;

public class OTP_one_time_password {
    public static void main(String[] args){
        //Length of your password as I have choose
//        here to be 10
        int length = 15;
        System.out.println(password(length));
    }

//    This our password generating method
//    we have use static here, so that we not to
//    make any object for it
    static char[] password(int len){
        System.out.println("Generating password using random() : ");
        System.out.print("Your new password is : ");

//        A string password has Cap_chars, Lower_chars,
//        numeric value and symbols. SO we are using all of
//        them to generate our password
        String capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";

        String values = capital_chars + small_chars + numbers + symbols;

//        Using random method
        Random rndm_method = new Random();

        char[] password = new char[len];

        for(int i=0; i<len; i++){
//            SUe of charAt() method : to get character value
//            Use of nextInt() as it is scanning the value as int
            password[i] = values.charAt(rndm_method.nextInt(values.length()));
        }
        return password;
    }
}

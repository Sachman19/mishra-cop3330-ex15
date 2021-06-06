/*
 *  UCF COP3330 Summer 2021 Assignment 15 Solution
 *  Copyright 2021 Sachin Mishra
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your username. ");
        String user = input.nextLine();

        System.out.print("Enter your password. ");
        String password = input.nextLine();

        if(password.equals("abc$123")){
            System.out.printf("Welcome back %s!", user);
        }
        else{
            System.out.println("I dont know you.");
        }
    }
}
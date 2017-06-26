package com.company;
/*
Prompt the user to enter a string. AFter the user enters a string, output the same string bak to the console.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String echo;
        System.out.println("Enter some text:");
        echo = scnr.nextLine();
        System.out.println(echo);

    }
}

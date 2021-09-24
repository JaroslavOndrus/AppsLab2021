package com.appslab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner consoleIn = new Scanner(System.in);

        System.out.println("Write Your First Word To Compare: ");
        String word1 = consoleIn.nextLine();

        System.out.println("Write Your Second Word To Compare: ");
        String word2 = consoleIn.nextLine();

        System.out.println(CheckTheEndOfString(word1, word2));
    }

    public static boolean CheckTheEndOfString(String word1, String word2){

        if(word1.endsWith(word2)){
            return true;
        }
        else{
            return false;
        }
    }
}

package com.appslab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner consoleIn = new Scanner(System.in);
        System.out.println("Write Your Word to test, if it is a palindrome: ");
        String yourWord = consoleIn.nextLine();

        System.out.println(isPalindrome(yourWord));
    }

    public static boolean isPalindrome(String yourWord){
        StringBuilder sb=new StringBuilder(yourWord);
        sb.reverse();
        String rev=sb.toString();

        if(yourWord.equals(rev)){
            return true;
        }

        else{
            return false;
        }
    }
}

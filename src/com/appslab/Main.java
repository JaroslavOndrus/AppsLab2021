package com.appslab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Scanner consoleIn = new Scanner(System.in);
        int array1[] = {44, 32, 86, 19};
        int biggestNumber;
        int smallestNumber;

        biggestNumber = smallestNumber = array1[0];

        for(int i = 1; i < array1.length; i++) {

            if(biggestNumber < array1[i]){
                biggestNumber = array1[i];
            }
        }

        for(int i = 0; i < array1.length; i++){

            if(smallestNumber > array1[i]){
                smallestNumber = array1[i];
            }
        }

        System.out.println("The Smallest Number is: " + smallestNumber);
        System.out.println("The Biggest Number is: " + biggestNumber);
        System.out.println("The Difference Between The Biggest Number And The Smallest One Is: " + (biggestNumber - smallestNumber));
    }
}

package com.appslab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Scanner consoleIn = new Scanner(System.in);

        System.out.println("Write First Number: ");
        int firstNumber = consoleIn.nextInt();

        System.out.println("Write Second Number: ");
        int secondNumber = consoleIn.nextInt();

        System.out.println("Write Third Number: ");
        int thirdNumber = consoleIn.nextInt();

        System.out.println(ReturnEqualValue(firstNumber, secondNumber, thirdNumber));
    }

    public static int ReturnEqualValue(int firstNumber, int secondNumber, int thirdNumber){

        int numbersAreEqual = 0;

        if(firstNumber == secondNumber && firstNumber == thirdNumber){
            numbersAreEqual = 3;
        }
        else if(firstNumber == secondNumber && firstNumber != thirdNumber){
            numbersAreEqual = 2;
        }
        else if(firstNumber != secondNumber && firstNumber == thirdNumber){
            numbersAreEqual = 2;
        }
        else if(firstNumber != secondNumber && secondNumber == thirdNumber){
            numbersAreEqual = 2;
        }
        else if(firstNumber != secondNumber && secondNumber != thirdNumber){
            numbersAreEqual = 0;
        }

        return numbersAreEqual;
    }
}

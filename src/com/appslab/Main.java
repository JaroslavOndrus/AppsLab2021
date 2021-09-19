package com.appslab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner consoleIn = new Scanner(System.in);

        System.out.println("Write height of step: ");
        double heightOfStep = consoleIn.nextDouble();

        System.out.println("Write length of one step: ");
        double lengthOfStep = consoleIn.nextDouble();

        System.out.println("Write height of the tower: ");
        double heightOfTower = consoleIn.nextDouble();

        if(heightOfTower > 0 && heightOfStep > 0 && lengthOfStep > 0){

            double totalDistance = ((heightOfTower/heightOfStep)*(heightOfStep+lengthOfStep));
            System.out.println("Total Distance is: "+totalDistance);
        }
        else{
            System.out.println("Your values were lower than 0, try again");
        }
    }
}

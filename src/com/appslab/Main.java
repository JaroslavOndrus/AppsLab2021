package com.appslab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner consoleIn = new Scanner(System.in);

        System.out.println("Write Number Of Slices: ");
        int numberOfSlices = consoleIn.nextInt();

        System.out.println("Write Number Of Recipients: ");
        int numberOfRecipients = consoleIn.nextInt();

        System.out.println("Write How Many Slices Each Person Gets: ");
        int slicesEach = consoleIn.nextInt();

        System.out.println(EqualPieSlices(numberOfSlices, numberOfRecipients, slicesEach));
    }

    public static boolean EqualPieSlices(int numberOfSlices, int numberOfRecipients, int slicesEach){

        boolean equal = true;

        if((numberOfRecipients*slicesEach) > numberOfSlices){
            equal = false;
        }
        else if ((numberOfRecipients*slicesEach) < numberOfSlices){
            equal = true;
        }

        return equal;
    }
}

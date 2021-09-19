package com.appslab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Scanner consoleIn = new Scanner(System.in);

        System.out.println("Write First Site Of Triangle: ");
        int site1 = consoleIn.nextInt();

        System.out.println("Write First Site Of Triangle: ");
        int site2 = consoleIn.nextInt();

        System.out.println("Write First Site Of Triangle: ");
        int site3 = consoleIn.nextInt();

        System.out.println(EqualOfTriangle(site1, site2, site3));
    }

    public static boolean EqualOfTriangle(int site1, int site2, int site3){
        boolean equal = true;
        if((site1*site1)+(site2*site2)==(site3*site3)) {
            equal = true;
        }
        else{
            equal = false;
        }
        return equal;
    }
}

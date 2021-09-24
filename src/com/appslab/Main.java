package com.appslab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Scanner consoleIn = new Scanner(System.in);
        int[] array = {12, 90, 75};
        int even = 0;
        int odd = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] %2 == 0){
                even += array[i];
            }
            else{
                odd += array[i];
            }
        }

        if(even > odd){
            System.out.println("Even > Odd");
            int a = even - odd;
            System.out.println(a);
        }
        else{
            System.out.println("Odd > Even");
            int b = odd - even;
            System.out.println(b);
        }
    }
}

package com.appslab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Scanner consoleIn = new Scanner(System.in);

        String[] rok1 = {"A8","E8"};
        String[] rok2= {"A1","B2"};
        String[] rok3 = {"H4","H3"};
        String[] rok4 = {"F5","C8"};

        System.out.print(TwoRooksAttack(rok1) +"\n");
        System.out.print(TwoRooksAttack(rok2)+"\n");
        System.out.print(TwoRooksAttack(rok3)+"\n");
        System.out.print(TwoRooksAttack(rok4));

    }
    public static boolean TwoRooksAttack(String[] rok)
    {
        String rok1 = rok[0];
        String rok2 = rok[1];
        return rok1.charAt(0) == rok2.charAt(0) || rok1.charAt(1) == rok2.charAt(1);
    }
}

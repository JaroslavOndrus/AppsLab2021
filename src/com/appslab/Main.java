package com.appslab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner consoleIn = new Scanner(System.in);
        System.out.println("Write rock, paper or scissors");

        System.out.println("PLAYER 1: ");
        String player1 = consoleIn.nextLine();

        System.out.println("PLAYER 2: ");
        String player2 = consoleIn.nextLine();

        System.out.println(WhoIsTheWinner(player1, player2));
    }

    public static String WhoIsTheWinner(String player1, String player2){

        String result = "";

        if(player1.equals("rock") && player2.equals("rock") || player1.equals("scissors") && player2.equals("scissors")){
            result = "TIE";
        }
        else if(player1.equals("paper") && player2.equals("paper")){
            result = "TIE";
        }
        else if (player1.equals("scissors") && player2.equals("paper")){
            result = "PLAYER 1 WINS!";
        }
        else if(player1.equals("paper") && player2.equals("rock")){
            result = "PLAYER 1 WINS!";
        }
        else if(player1.equals("rock") && player2.equals("scissors")){
            result = "PLAYER 1 WINS!";
        }
        else{
            result = "PLAYER 2 WINS!";
        }

        return result;
    }
}

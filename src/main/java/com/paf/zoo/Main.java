package com.paf.zoo;

import com.paf.zoo.model.PafZoo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to zoo of Paf!");

        Command command = Command.HELP;
        Scanner scan = new Scanner(System.in);

        // TODO: refactor command, add usage help
        while (true) {
            // execute action base on command
            switch (command) {
                case DISPLAY:
                    PafZoo.getInstance().display();
                    break;
                case UNKNOWN:
                    System.out.println("Unknown command!");
                    break;
                case LIVE:
                    PafZoo.getInstance().liveOneDay();
                    break;
                case EXIT:
                    PafZoo.getInstance().exit();
            }
            System.out.println();
            try {
                System.out.print("Please input your command: ");
                command = Command.valueOf(scan.nextLine().trim().toUpperCase());
            } catch (IllegalArgumentException ex) {
                command = Command.UNKNOWN;
            }
        }
    }
}

package com.paf.zoo;

import com.paf.zoo.command.CommandInvoker;

import java.util.Scanner;

/**
 * Client
 */
public class Main {
    public static void main(String[] args) {
        CommandInvoker commandInvoker = CommandInvoker.HELP;
        Scanner scan = new Scanner(System.in);

        while (true) {
            commandInvoker.execute();
            try {
                System.out.print("Please input your command: ");
                commandInvoker = CommandInvoker.valueOf(scan.nextLine().trim().toUpperCase());
            } catch (IllegalArgumentException ex) {
                commandInvoker = CommandInvoker.UNKNOWN;
            }
        }
    }
}

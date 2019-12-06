package com.paf.zoo.service;

public class HelpService {
    public static void displayUsage() {
        System.out.println("-------------- Help/Usage ---------------");
        System.out.println("Commands in the zoo system:");
        System.out.println("display\t\tShow current status of all animals in zoo");
        System.out.println("live\t\tLive one day in zoo, all changes in zoo will be displayed");
        System.out.println("help\t\tShow help information of command usage");
        System.out.println("exit\t\tExit system");
    }
}

package com.paf.zoo.command;

public class UnknownCommand implements Command {
    private static UnknownCommand INSTANCE;

    private UnknownCommand() {}

    public static UnknownCommand getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new UnknownCommand();
        }
        return INSTANCE;
    }

    @Override
    public void execute() {
        System.out.println("Unknown command!");
    }
}

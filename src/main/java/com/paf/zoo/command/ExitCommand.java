package com.paf.zoo.command;

public class ExitCommand implements Command {
    private static ExitCommand INSTANCE;

    private ExitCommand() {}

    public static ExitCommand getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ExitCommand();
        }
        return INSTANCE;
    }

    @Override
    public void execute() {
        System.exit(0);
    }
}

package com.paf.zoo.command;

import com.paf.zoo.model.PafZoo;

public enum CommandInvoker {
    EXIT(ExitCommand.getInstance()),
    HELP(HelpCommand.getInstance()),
    DISPLAY(new DisplayCommand(PafZoo.getInstance())),
    LIVE(new LiveOneDayCommand(PafZoo.getInstance())),
    UNKNOWN(UnknownCommand.getInstance());

    private final Command command;

    CommandInvoker(final Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }

    public void execute() {
        command.execute();
    }
}

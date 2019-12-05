package com.paf.zoo;

import com.paf.zoo.command.*;
import com.paf.zoo.model.PafZoo;

public enum CommandInvoker {
    EXIT(new ExitCommand()),
    HELP(new HelpCommand()),
    DISPLAY(new DisplayCommand(PafZoo.getInstance())),
    LIVE(new LiveOneDayCommand(PafZoo.getInstance())),
    UNKNOWN(new UnknownCommand());

    private final Command command;

    CommandInvoker(final Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}

package com.paf.zoo.command;

import com.paf.zoo.Helper;

public class HelpCommand implements Command {
    private static HelpCommand INSTANCE;

    private HelpCommand() {}

    public static HelpCommand getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new HelpCommand();
        }
        return INSTANCE;
    }

    @Override
    public void execute() {
        Helper.displayUsage();
    }
}

package com.paf.zoo.command;

import com.paf.zoo.Helper;

public class HelpCommand implements Command {
    @Override
    public void execute() {
        Helper.displayUsage();
    }
}

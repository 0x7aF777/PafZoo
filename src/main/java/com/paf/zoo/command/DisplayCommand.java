package com.paf.zoo.command;

import com.paf.zoo.model.Zoo;

public class DisplayCommand implements Command {
    private static Command INSTANCE;

    private Zoo zoo;

    public DisplayCommand(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        zoo.display();
    }
}

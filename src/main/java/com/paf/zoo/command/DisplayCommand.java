package com.paf.zoo.command;

import com.paf.zoo.service.Zoo;

public class DisplayCommand implements Command {

    private Zoo zoo;

    public DisplayCommand(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        zoo.display();
    }
}

package com.paf.zoo.command;

import com.paf.zoo.model.Zoo;

public class LiveOneDayCommand implements Command {
    private Zoo zoo;

    public LiveOneDayCommand(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        zoo.liveOneDay();
    }
}

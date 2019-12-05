package com.paf.zoo.model;

import java.util.Objects;

public class Parrot extends Bird {
    private boolean couldSpeak;

    public Parrot(String name, String favoriteFood, float wingspan, boolean couldSpeak) {
        super(name, favoriteFood, wingspan);
        this.couldSpeak = couldSpeak;
    }

    public boolean isCouldSpeak() {
        return couldSpeak;
    }

    public void setCouldSpeak(boolean couldSpeak) {
        this.couldSpeak = couldSpeak;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("- " + (this.couldSpeak ? "Can speak." : "Cannot speak."));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Parrot)) return false;
        if (!super.equals(o)) return false;
        Parrot parrot = (Parrot) o;
        return isCouldSpeak() == parrot.isCouldSpeak();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isCouldSpeak());
    }
}

package com.paf.zoo.model;

import java.util.Objects;

public class Parrot extends Bird {
    private boolean couldSpeak;

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

    private Parrot(Builder builder) {
        super(builder);
        this.couldSpeak = builder.couldSpeak;
    }

    public static Builder builder(String name, String favoriteFood) {
        return new Builder(name, favoriteFood);
    }

    public static class Builder extends Bird.Builder<Builder> {

        private boolean couldSpeak = false;

        public Builder(String name, String favoriteFood) {
            super(name, favoriteFood);
        }

        public Builder couldSpeak(boolean couldSpeak) {
            this.couldSpeak = couldSpeak;
            return self();
        }

        @Override
        Parrot build() {
            return new Parrot(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}

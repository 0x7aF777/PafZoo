package com.paf.zoo.model;

import java.util.Objects;

public abstract class Bird extends Animal {
    private float wingspan;

    public Bird(String name, String favoriteFood, float wingspan) {
        super(name, favoriteFood);
        this.wingspan = wingspan;
    }

    public float getWingspan() {
        return wingspan;
    }

    public void setWingspan(float wingspan) {
        this.wingspan = wingspan;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(String.format("- Wingspan: %.2f", this.wingspan));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bird)) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Float.compare(bird.getWingspan(), getWingspan()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getWingspan());
    }
}

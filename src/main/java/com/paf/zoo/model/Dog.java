package com.paf.zoo.model;

import java.util.Objects;

public class Dog extends Animal {
    private String dogType;

    public Dog(String name, String favoriteFood, String dogType) {
        super(name, favoriteFood);
        this.dogType = dogType;
    }

    public String getDogType() {
        return dogType;
    }

    public void setDogType(String dogType) {
        this.dogType = dogType;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(String.format("- Dog type: %s.", this.dogType));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return getDogType().equals(dog.getDogType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDogType());
    }
}

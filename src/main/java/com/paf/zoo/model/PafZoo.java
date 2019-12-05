package com.paf.zoo.model;

import com.paf.zoo.Utility;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

public class PafZoo implements Zoo {
    private static PafZoo INSTANCE;
    private Collection<Animal> animals = new HashSet<>();

    private PafZoo() {
        initialZoo();
    }

    public static PafZoo getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PafZoo();
        }
        return INSTANCE;
    }

    private void initialZoo() {
        animals.add(new Dog("Dog one", "Meat", "Hunting dog"));
        animals.add(new Parrot("Parrot one", "Grain", 0.25f, false));
        animals.add(new Chicken("Chicken one", "Corn", 0.75f, true));
        animals.add(new Dog("Dog two", "Fresh meat", "Assistance dog"));
        animals.add(new Parrot("Parrot two", "Corn", 0.5f, true));
        animals.add(new Dog("Dog three", "Pedigree", "Racing dog"));
        animals.add(new Chicken("Chicken two", "Corn", 0.75f, false));
    }

    @Override
    public Collection<Animal> getAnimals() {
        return animals;
    }

    @Override
    public void display() {
        animals.forEach(Animal::display);
    }

    /**
     * Could animal A lose friendship with B and build build friendship with B again in the same day?
     * Make friend and lose friend should be happened in parallel
     */
    @Override
    public void liveOneDay() {
        throw new NotImplementedException();
    }

    @Override
    public void welcome() {
        System.out.println("Welcome to the PafZoo!");
    }

    @Override
    public void exit() {
        System.out.println("BayBay, see you next time!");
    }

    @Override
    public boolean addAnimal() {
        throw new NotImplementedException();
    }

    @Override
    public boolean removeAnimal() {
        throw new NotImplementedException();
    }
}

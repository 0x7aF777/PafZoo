package com.paf.zoo.model;

import java.util.Collection;

public interface Zoo extends DisplayAble {

    Collection<Animal> getAnimals();

    void liveOneDay();

    void welcome();

    void exit();

    boolean addAnimal();

    boolean removeAnimal();
}

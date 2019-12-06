package com.paf.zoo.service;

import com.paf.zoo.model.Animal;

import java.util.Collection;
import java.util.UUID;

public interface DataService {
    Collection<Animal> getAnimals();

    boolean addAnimal(Animal animal);

    boolean removeAnimal(UUID uuid);

    boolean updateAnimal(Animal animal);
}

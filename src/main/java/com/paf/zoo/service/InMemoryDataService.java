package com.paf.zoo.service;

import com.paf.zoo.model.Animal;
import com.paf.zoo.model.Chicken;
import com.paf.zoo.model.Dog;
import com.paf.zoo.model.Parrot;

import java.util.Collection;
import java.util.HashSet;

public class InMemoryDataService implements DataService {
    @Override
    public Collection<Animal> loadAnimalsInZoo() {
        Collection<Animal> animals = new HashSet<>();
        animals.add(new Dog("Dog one", "Meat", "Hunting dog"));
        animals.add(new Dog("Dog two", "Fresh meat", "Assistance dog"));
        animals.add(new Dog("Dog three", "Pedigree", "Racing dog"));

        animals.add(
                Chicken.builder("Chicken one", "Corn").wingspan(0.75f).isBroiler(true).build()
        );
        animals.add(
                Chicken.builder("Chicken two", "Corn").wingspan(0.75f).isBroiler(false).build()
        );

        animals.add(
                Parrot.builder("Parrot one", "Grain").wingspan(0.25f).couldSpeak(false).build()
        );
        animals.add(
                Parrot.builder("Parrot two", "Corn").wingspan(0.5f).couldSpeak(true).build()
        );
        return animals;
    }
}

package com.paf.zoo.service;

import com.paf.zoo.model.Animal;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collection;
import java.util.UUID;

public class DatabaseDataService implements DataService {

    @Override
    public Collection<Animal> getAnimals() {
        throw new NotImplementedException();
    }

    @Override
    public boolean addAnimal(Animal animal) {
        throw new NotImplementedException();
    }

    @Override
    public boolean removeAnimal(UUID uuid) {
        throw new NotImplementedException();
    }

    @Override
    public boolean updateAnimal(Animal animal) {
        throw new NotImplementedException();
    }
}

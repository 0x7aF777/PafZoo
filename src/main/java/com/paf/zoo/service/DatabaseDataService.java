package com.paf.zoo.service;

import com.paf.zoo.model.Animal;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collection;

public class DatabaseDataService implements DataService {
    @Override
    public Collection<Animal> loadAnimalsInZoo() {
        throw new NotImplementedException();
    }
}

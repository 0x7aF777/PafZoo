package com.paf.zoo.service;

import com.paf.zoo.model.Animal;

import java.util.Collection;

public interface DataService {
    Collection<Animal> loadAnimalsInZoo();
}

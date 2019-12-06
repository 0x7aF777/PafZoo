package com.paf.zoo.service;

import com.paf.zoo.model.Animal;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;

public class InMemoryDataServiceTest {
    @Test
    public void loadAnimalsInZooTest() {
        DataService dataService = new InMemoryDataService();
        Collection<Animal> animals = dataService.loadAnimalsInZoo();
        Assert.assertNotNull(animals);
        Assert.assertEquals(7, animals.size());
    }
}

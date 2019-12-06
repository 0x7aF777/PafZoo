package com.paf.zoo.service;

import org.junit.Test;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class DatabaseDataServiceTest {

    // Implement unit tests for DatabaseDataService when the implementation is done
    @Test(expected = NotImplementedException.class)
    public void lgetAnimalsTest() {
        DataService dataService = new DatabaseDataService();
        dataService.getAnimals();
    }
}

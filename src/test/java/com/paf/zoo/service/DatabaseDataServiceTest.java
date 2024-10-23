package com.paf.zoo.service;

import org.apache.commons.lang3.NotImplementedException;
import org.junit.Test;

public class DatabaseDataServiceTest {

    // Implement unit tests for DatabaseDataService when the implementation is done
    @Test(expected = NotImplementedException.class)
    public void lgetAnimalsTest() {
        DataService dataService = new DatabaseDataService();
        dataService.getAnimals();
    }
}

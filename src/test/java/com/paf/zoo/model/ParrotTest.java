package com.paf.zoo.model;

import org.junit.Assert;
import org.junit.Test;

public class ParrotTest {
    @Test
    public void parrotPropertyTest() {
        String name = "Parrot One";
        String food = "Corn";
        float wingspan = 0.5f;
        Parrot parrot = Parrot.builder(name, food)
                .wingspan(wingspan)
                .build();

        Assert.assertEquals(name, parrot.getName());
        Assert.assertEquals(food, parrot.getFavoriteFood());
        Assert.assertEquals(wingspan, parrot.getWingspan(), 0.0001f);
        Assert.assertFalse("Parrot couldn't speak by default", parrot.isCouldSpeak());

        String newName = "New Name";
        parrot.setName(newName);
        Assert.assertEquals(newName, parrot.getName());
    }

    @Test
    public void parrotEqualTest() {
        String name1 = "Parrot One";
        String name2 = "Parrot Two";
        String food1 = "Rice";
        String food2 = "Corn";

        float wingspan = 0.5f;
        Parrot parrot1 = Parrot.builder(name1, food1)
                .wingspan(wingspan)
                .couldSpeak(true)
                .build();
        Parrot parrot2 = Parrot.builder(name2, food2)
                .wingspan(wingspan)
                .couldSpeak(true)
                .build();
        Assert.assertNotEquals(parrot1, parrot2);

        Parrot parrot3 = Parrot.builder(name1, food1)
                .wingspan(wingspan)
                .couldSpeak(true)
                .build();
        // Even two parrots have exactly the same properties(name, favorite food, wingspan, could speak)
        // they shouldn't be equal
        Assert.assertNotEquals(parrot1, parrot3);
    }
}

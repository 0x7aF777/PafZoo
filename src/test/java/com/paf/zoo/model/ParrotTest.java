package com.paf.zoo.model;

import org.junit.Assert;
import org.junit.Test;

public class ParrotTest {
    @Test
    public void parrotPropertyTest() {
        String name = "Parrot One";
        String food = "Corn";
        float wingspan = 0.5f;
        Parrot parrot = new Parrot(name, food, wingspan, false);
        Assert.assertEquals(name, parrot.getName());
        Assert.assertEquals(food, parrot.getFavoriteFood());
        Assert.assertEquals(wingspan, parrot.getWingspan(), 0.0001f);
        Assert.assertFalse(parrot.isCouldSpeak());

        String newName = "New Name";
        parrot.setName(newName);
        Assert.assertEquals(newName, parrot.getName());
    }

    @Test
    public void parrotEqualTest() {
        String name1 = "Parrot One";
        String name2 = "Parrot One";
        String food1 = "Rice";
        String food2 = "Corn";

        float wingspan = 0.5f;
        Parrot parrot1 = new Parrot(name1, food1, wingspan, true);
        Parrot parrot2 = new Parrot(name2, food2, wingspan, true);
        Assert.assertNotEquals(parrot1, parrot2);

        Parrot parrot3 = new Parrot(name1, food1, wingspan, true);
        // Even two parrots have exactly the same properties(name, favorite food, wingspan, could speak)
        // they shouldn't be equal
        Assert.assertNotEquals(parrot1, parrot3);
    }
}

package com.paf.zoo.model;

import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {

    @Test
    public void chickenPropertyTest() {
        String name = "Chicken One";
        String food = "Rice";
        float wingspan = 0.5f;
        Chicken chicken = Chicken.builder(name, food)
                .wingspan(wingspan)
                .isBroiler(true)
                .build();
        Assert.assertEquals(name, chicken.getName());
        Assert.assertEquals(food, chicken.getFavoriteFood());
        Assert.assertEquals(wingspan, chicken.getWingspan(), 0.0001f);
        Assert.assertTrue(chicken.isBroiler());

        String newName = "New Name";
        chicken.setName(newName);
        Assert.assertEquals(newName, chicken.getName());
    }

    @Test
    public void chickenEqualTest() {
        String name1 = "Chicken One";
        String name2 = "Chicken One";
        String food1 = "Rice";
        String food2 = "Corn";

        float wingspan = 0.5f;
        Chicken chicken1 = Chicken.builder(name1, food1)
                .wingspan(wingspan)
                .isBroiler(true)
                .build();
        Chicken chicken2 = Chicken.builder(name2, food2)
                .wingspan(wingspan)
                .isBroiler(true)
                .build();
        Assert.assertNotEquals(chicken1, chicken2);

        Chicken chicken3 = Chicken.builder(name1, food1)
                .wingspan(wingspan)
                .isBroiler(true)
                .build();
        // Even two chickens have exactly the same properties(name, favorite food, wingspan, is broiler)
        // they shouldn't be equal
        Assert.assertNotEquals(chicken1, chicken3);
    }
}

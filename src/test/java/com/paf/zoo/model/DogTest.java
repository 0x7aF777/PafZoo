package com.paf.zoo.model;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void dogPropertyTest() {
        String name = "Chicken One";
        String food = "Rice";
        String dogType = "Hunting Dog";
        Dog dog = new Dog(name, food, dogType);
        Assert.assertEquals(name, dog.getName());
        Assert.assertEquals(food, dog.getFavoriteFood());
        Assert.assertEquals(dogType, dog.getDogType());

        String newName = "New Name";
        String newFood = "Meat";
        dog.setName(newName);
        dog.setFavoriteFood(newFood);
        Assert.assertEquals(newName, dog.getName());
        Assert.assertEquals(newFood, dog.getFavoriteFood());
    }

    @Test
    public void dogEqualTest() {
        String name1 = "Dog One";
        String name2 = "Dog One";
        String food1 = "Meat";
        String food2 = "Pedigree";
        String dogType = "Hunting Dog";

        float wingspan = 0.5f;
        Dog dog1 = new Dog(name1, food1, dogType);
        Dog dog2 = new Dog(name2, food2, dogType);
        Assert.assertNotEquals(dog1, dog2);

        Dog dog3 = new Dog(name1, food1, dogType);
        // Even two dogs have exactly the same properties(name, favorite food, dog type)
        // they shouldn't be equal
        Assert.assertNotEquals(dog1, dog3);
    }
}

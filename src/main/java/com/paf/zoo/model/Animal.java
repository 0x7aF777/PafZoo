package com.paf.zoo.model;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Abstract class Animal
 * An animal could change its name and favorite food,
 * animals could have the same name
 */
public abstract class Animal implements DisplayAble {
    private UUID uuid;

    private String name;
    private String favoriteFood;
    private Collection<Animal> friends = Collections.synchronizedSet(new HashSet<>());

    public Animal(String name, String favoriteFood) {
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.favoriteFood = favoriteFood;
    }

    /**
     * Animal cannot be friend of itself
     * Animal cannot build friendship with someone twice
     * @param animal
     */
    public boolean addFriend(Animal animal) {
        if (this != animal && this.friends.add(animal)) {
            animal.friends.add(this);
            return true;
        }
        return false;
    }

    // avoid infinite recursion
    public boolean removeFriend(Animal animal) {
        if (this.friends.remove(animal)) {
            animal.friends.remove(this);
            return true;
        }
        return false;
    }

    public boolean isFriendOf(Animal animal) {
        return this.friends.contains(animal);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public Collection<Animal> getFriends() {
        return friends;
    }

    public String getFriendsNames() {
        return getFriends().stream().map(Animal::getName).collect(Collectors.joining(", "));
    }

    public void display() {
        System.out.println("----------------");
        System.out.println(this.getClass().getSimpleName());
        System.out.println(String.format("- Name: \"%s\";", this.name));
        System.out.println(String.format("- Favorite food: \"%s\";", this.favoriteFood));
        if (this.friends.size() > 0) {
            System.out.println(String.format("- My friends: %s;", this.getFriendsNames()));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return uuid.equals(animal.uuid) &&
                getName().equals(animal.getName()) &&
                getFavoriteFood().equals(animal.getFavoriteFood());
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, getName(), getFavoriteFood());
    }
}

package com.paf.zoo.service;

import com.paf.zoo.Utility;
import com.paf.zoo.model.Animal;

import java.util.*;

/**
 * Receiver
 */
public class PafZoo implements Zoo {
    private static PafZoo INSTANCE;
    // In Spring framework, this property could be annotated with @Autowired annotation
    private DataService dataService;

    private PafZoo() {
        dataService = new InMemoryDataService();
    }

    public static PafZoo getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PafZoo();
            INSTANCE.welcome();
        }
        return INSTANCE;
    }

    @Override
    public Collection<Animal> getAnimals() {
        return dataService.getAnimals();
    }

    @Override
    public void display() {
        dataService.getAnimals().forEach(Animal::display);
    }

    /**
     * Could animal A lose friendship with B and build build friendship with B again in the same day?
     * Make friend and lose friend should be happened in parallel
     */
    @Override
    public void liveOneDay() {
        System.out.println("--------- One Day Start ----------");
        Random random = new Random();
        Collection<Animal> animals = dataService.getAnimals();
        animals.parallelStream().forEach(animal -> {
            // TODO: should break friendship and make friendship parallel?
            // break friendship with one friend randomly if had any, important
            Animal friend = Utility.getRandomElement(animal.getFriends());
            if(friend != null) {
                animal.removeFriend(friend);
            }
            // build friendship, A couldn't build friendship with itself
            if (random.nextBoolean()) {
                Animal newFriend = Utility.getRandomElement(animals, animal.getFriends(), Collections.singleton(animal));
                animal.addFriend(newFriend);
            }
        });
        System.out.println("--------- One Day End ----------");
    }

    public void welcome() {
        System.out.println("======= Welcome to the zoo of Paf! =======");
    }

    @Override
    public void exit() {
        System.out.println("BayBay, see you next time!");
        System.exit(0);
    }

    @Override
    public boolean addAnimal(Animal animal) {
        return dataService.addAnimal(animal);
    }

    @Override
    public boolean removeAnimal(UUID uuid) {
        return dataService.removeAnimal(uuid);
    }
}

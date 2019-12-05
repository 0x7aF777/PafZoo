package com.paf.zoo.model;

import java.util.Objects;

public class Chicken extends Bird {
    private boolean isBroiler;

    public Chicken(String name, String favoriteFood, float wingspan, boolean isBroiler) {
        super(name, favoriteFood, wingspan);
        this.isBroiler = isBroiler;
    }

    public boolean isBroiler() {
        return isBroiler;
    }

    public void setBroiler(boolean broiler) {
        isBroiler = broiler;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("- " + (this.isBroiler ? "Is broiler." : "Is not broiler."));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chicken)) return false;
        if (!super.equals(o)) return false;
        Chicken chicken = (Chicken) o;
        return isBroiler() == chicken.isBroiler();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isBroiler());
    }
}

package com.paf.zoo.model;

import java.util.Objects;

public class Chicken extends Bird {
    private boolean isBroiler;

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

    private Chicken(Builder builder) {
        super(builder);
        this.isBroiler = builder.isBroiler;
    }

    public static Chicken.Builder builder(String name, String favoriteFood) {
        return new Chicken.Builder(name, favoriteFood);
    }

    public static class Builder extends Bird.Builder<Builder> {

        private boolean isBroiler = false;

        public Builder(String name, String favoriteFood) {
            super(name, favoriteFood);
        }

        public Builder isBroiler(boolean isBroiler) {
            this.isBroiler = isBroiler;
            return self();
        }

        @Override
        Chicken build() {
            return new Chicken(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}

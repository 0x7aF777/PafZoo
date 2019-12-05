package com.paf.zoo.model;

import java.util.Objects;

public abstract class Bird extends Animal {
    private float wingspan;

    public float getWingspan() {
        return wingspan;
    }

    public void setWingspan(float wingspan) {
        this.wingspan = wingspan;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(String.format("- Wingspan: %.2f", this.wingspan));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bird)) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Float.compare(bird.getWingspan(), getWingspan()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getWingspan());
    }

    Bird(Builder<?> builder) {
        super(builder.name, builder.favoriteFood);
        this.wingspan = builder.wingspan;
    }

    abstract static class Builder<T extends Builder<T>> {
        private String name;
        private String favoriteFood;

        private float wingspan = -1f; // unknown wing span

        public Builder(String name, String favoriteFood) {
            this.name = name;
            this.favoriteFood = favoriteFood;
        }

        public T wingspan(float span) {
            this.wingspan = span;
            return self();
        }

        abstract Bird build();

        protected abstract T self();
    }
}

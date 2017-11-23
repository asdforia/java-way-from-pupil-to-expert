package ru.duplo.clinic;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return String.format("Dog says: %s.", super.getName());
    }

    public void catchCat() {

    }

    private boolean isHungry() {
        return true;
    }

}

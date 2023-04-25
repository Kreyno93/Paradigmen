package de.neuefische;

import java.util.Objects;

public class Motorbike extends Vehicle {

    private boolean helmet;

    public Motorbike(String brand, int numberOfWheels, int horsePower, boolean helmet) {
        super(brand, numberOfWheels, horsePower);
        this.helmet = helmet;
    }

    public Motorbike() {
    }

    public boolean isHelmet() {
        return helmet;
    }
}

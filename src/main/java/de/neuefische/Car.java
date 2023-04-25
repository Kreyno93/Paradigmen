package de.neuefische;

import java.util.Objects;

public class Car extends Vehicle {

    private boolean seatbelt;

    public Car(String brand, int numberOfWheels, int horsePower, boolean seatbelt) {
        super(brand, numberOfWheels, horsePower);
        this.seatbelt = seatbelt;
    }

    public Car() {
    }

    public boolean isSeatbelt() {
        return seatbelt;
    }
}

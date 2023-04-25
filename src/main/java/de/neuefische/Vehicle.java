package de.neuefische;

public class Vehicle {

    private String brand;
    private int numberOfWheels;
    private int horsePower;

    public Vehicle(String brand, int numberOfWheels, int horsePower) {
        this.brand = brand;
        this.numberOfWheels = numberOfWheels;
        this.horsePower = horsePower;
    }

    public Vehicle() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}

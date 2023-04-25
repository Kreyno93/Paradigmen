package de.neuefische;

public class Motorbike extends Vehicle{

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

    @Override
    public String toString() {
        return "Motorbike{" +
                "helmet=" + helmet +
                "} " + super.toString();
    }

    @Override
    public String accelerate() {
        return "Gashahn voll aufdrehen!";
    }

}

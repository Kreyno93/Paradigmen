package de.neuefische;

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

    @Override
    public String accelerate(){
        return "Pedal to the Metal";
    }


}

package de.neuefische;


public class Main {
    public static void main(String[] args) {

        Car myCar = new Car();
        Motorbike myMotorbike = new Motorbike();
        Labello labello = new Labello();

        Measure measure = new Measure();
        System.out.println(measure.measureTopSpeed(myMotorbike));
        System.out.println(measure.measureTopSpeed(myCar));
        System.out.println(measure.measureTopSpeed(labello));
        System.out.println(myCar.accelerate());

        Vehicle myVehicle = new Car();
        Vehicle myVehicle2 = new Motorbike();
        Vehicle[] garage = {new Car(), new Motorbike()};


    }
}
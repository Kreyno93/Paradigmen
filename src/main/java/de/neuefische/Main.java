package de.neuefische;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car();
        Motorbike myMotorbike = new Motorbike();
        Vehicle anyVehicle = new Vehicle();
        Labello labello = new Labello();


        Measure measure = new Measure();
        System.out.println(measure.measureTopSpeed(myMotorbike));
        System.out.println(measure.measureTopSpeed(myCar));
        System.out.println(measure.measureTopSpeed(labello));


    }
}
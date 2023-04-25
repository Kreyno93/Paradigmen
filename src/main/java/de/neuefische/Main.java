package de.neuefische;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car();
        Motorbike myMotorbike = new Motorbike();

        System.out.println(myMotorbike);
        System.out.println(myCar);
        System.out.println(myCar.getBrand());
        System.out.println(myCar.isSeatbelt());

    }
}
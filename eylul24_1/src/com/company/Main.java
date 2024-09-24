package com.company;
public class Main {
    public static void main(String[] args) throws Exception {
        Vehicle vehicle1 = new Vehicle("TOGG","T10X",5);
        vehicle1.printVehicle();

        PassengerCar passengerCar1 = new PassengerCar("Audi", "A3", 5);
        passengerCar1.price = "500.000";
        System.out.println(passengerCar1.brand + " " + passengerCar1.price);
    }
}

package com.company;
public class PassengerCar extends Vehicle { //inheritance
    String price;

    //Implicit super constructor Vehicle() is undefined for default constructor. Must define an explicit constructor
    // we defined Vehicle() with constructors, when we inherited Vehicle() to PassangerCar(), we need to use constructors.

    PassengerCar(String brand,String model, int passenger){
        super(brand, model, passenger); //super keyword in Java is a reference variable that is used to refer to parent class when we’re working with objects
    }
}

package com.company;
public class Vehicle {

    String brand;
    protected String model; //access if they are in same package and subclasses
    private int passenger; // access only in same class

    Vehicle(String brand,String model,int passenger){ //constructor

        this.brand=brand;this.model=model;this.passenger=passenger;
        //keyword refers to the current object in a method or constructor
        //eliminate the confusion between class attributes and parameters with the same name
    }
    public void printVehicle(){
        System.out.println(this.brand + " " + this.passenger + " " + this.model);
    }
}

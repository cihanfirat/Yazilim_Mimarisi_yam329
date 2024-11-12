package com.company;

public class Scooter implements ElektrikliAracYap{

    @Override
    public void motorYap() {
        System.out.println("Scooter motoru");
    }

    @Override
    public void direksiyonYap() {
        System.out.println("Scooter direksiyonu");
    }

    @Override
    public void tekerlekYap() {
        System.out.println("Scooter tekerleri");
    }

    @Override
    public void bataryaYap() {
        System.out.println("Scooter bataryasi");
    }
}

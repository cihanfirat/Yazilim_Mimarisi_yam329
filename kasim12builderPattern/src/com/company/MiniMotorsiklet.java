package com.company;

public class MiniMotorsiklet implements  ElektrikliAracYap{
    @Override
    public void motorYap() {
        System.out.println("Minimotor motoru");
    }

    @Override
    public void direksiyonYap() {
        System.out.println("minimotor direksiyonu");
    }

    @Override
    public void tekerlekYap() {
        System.out.println("minimotor tekerlegi");
    }

    @Override
    public void bataryaYap() {
        System.out.println("minimotor bataryasi");
    }
}

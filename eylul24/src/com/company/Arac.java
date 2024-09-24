package com.company;


public class Arac {
    public String marka;
    public String model; //aynı paket altından erişim
    private kapasite; //aynı classta erşim

    Arac(String marka, String model, int kapasite){
        this.marka=marka;this.model=model;this.kapasite=kapasite;
        //keyword refers to the current object in a method or constructor
        //eliminate the confusion between class attributes and parameters with the same name
    }
}

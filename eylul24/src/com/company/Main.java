package com.company;
//access modifiers
public class Main {

    public static void main(String[] args) {
	   /* Arac arac1 = new Arac();
        arac1.marka = "TOGG";
        arac1.model = "T10X";
        //arac1.kapasite = 5;
        System.out.println(arac1.marka + " "  + arac1.model + " " + arac1.kapasite);*/

        BinekArac binekArac1 = new BinekArac("Auidi","TT",2);
        System.out.println(binekArac1.marka);

        Arac arac = new Arac("TOGG","T10X",2);
        System.out.println(arac.marka);

    }
}

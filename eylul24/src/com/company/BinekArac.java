package com.company;
//inheritance
public class BinekArac extends Arac{
    String fiyat;
    BinekArac(String marka, String model, int kapasite) {
        super(marka, model, kapasite);//super: degiskenleri tanımlarken üst classtan (Arac) aldıgı için oraya gonder
    }
}

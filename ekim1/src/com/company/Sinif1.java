package com.company;

public class Sinif1 implements Arayuz1,Arayuz2{
    @Override
    public void fonksiyon1(){
        System.out.println("Sınıf 1 \' deki fonksiyon 1 calıstı");
    }

    @Override
    public String fonksiyon2(){
        return "Sınıf 1 \' deki fonksiyon 2 calıstı";
    }

    // dikkat!
   /* public void fonksiyonx(){
        System.out.println("Sınıf 1 \' deki fonksiyon 3 calıstı");
    }*/
    @Override
    public void fonksiyon3(){
        System.out.println("Sınıf 1 \' deki fonksiyon 1 calıstı");
    }

    @Override
    public int fonksiyon4(){
        return 1;
    }
}

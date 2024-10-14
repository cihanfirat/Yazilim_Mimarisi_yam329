package com.company;

public class Client {
    public static void main(String[] args) {
        SekilFabrikası sekilFabrikası = new SekilFabrikası();
        ISekilTuru sekil1 = sekilFabrikası.SekilOlusturma(1);
        sekil1.Alan();
        System.out.println(sekil1.Cevre());

        ISekilTuru sekil2 = sekilFabrikası.SekilOlusturma(2);
        sekil2.Alan();
        System.out.println(sekil2.Cevre());

    }
}


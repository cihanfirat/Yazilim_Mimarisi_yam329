package com.company;

public class Main {

    public static void main(String[] args) {
	Director yonetici = new Director();
    ElektrikliAracYap arac1 = yonetici.Aractipi("scooter");
    yonetici.araciYap(arac1);

    ElektrikliAracYap arac2 = yonetici.Aractipi("Minimotor");
    yonetici.araciYap(arac2);

    /*ElektrikliAracYap arac3 = yonetici.Aractipi("ElektrikliBisiklet");
    yonetici.araciYap(arac3);
    Cannot invoke "ElektrikliAracYap.direksiyonYap()" because "arac" is null*/
    }
}

package com.company;
// sınavda kağıda şema çizme olabilir
// geçmiş dönem soruları?
// moodle-sema-intellij
// soyutfabrika,singleton,SOLID Prensipler?,şemalar

public class Main {

    public static void main(String[] args) {
        YayinEviSingleton yes = YayinEviSingleton.getInstance();
        IKitapFabrikası ikf = yes.getFabrika("DersKitabi");
        IKitap kitap1 = ikf.KitapBas();
        System.out.println(kitap1.toString());
    }
}
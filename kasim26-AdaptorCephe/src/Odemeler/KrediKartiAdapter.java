package Odemeler;

import Odemeler.IOdemeYontemi;

public class KrediKartiAdapter implements IOdemeYontemi {
    KrediKartiServisi kks = new KrediKartiServisi();
    @Override
    public void odemeYap(double tutar){
        kks.krediKartiIleOdeme(tutar);
    }
}

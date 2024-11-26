package Odemeler;

public class HavaleAdapter implements IOdemeYontemi{
    HavaleServisi hs = new HavaleServisi();
    @Override
    public void odemeYap(double tutar){
        hs.haveleileOdeme(tutar);
    }
}

package Odemeler;

public class NakitOdemeAdapter implements IOdemeYontemi{
    NakitServisi ns = new NakitServisi();
    @Override
    public void odemeYap(double tutar){
        ns.nakitOdeme(tutar);
    }
}

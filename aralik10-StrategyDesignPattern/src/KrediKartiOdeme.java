public class KrediKartiOdeme implements IOdemeYontemi{
    @Override
    public void odemeYap(double tutar){
        System.out.println("Kredi Karti ile Odeme Yapildi. Tutar: " + tutar);
    }
}

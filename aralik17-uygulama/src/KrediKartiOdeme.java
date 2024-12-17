public class KrediKartiOdeme implements IOdemeStratejisi{
    @Override
    public void odemeYap(double miktar) {
        System.out.println("Kredi karti ile odenen tutar: " + miktar);
    }
}

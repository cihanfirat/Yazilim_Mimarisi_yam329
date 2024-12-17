public class BankaKartiOdeme implements IOdemeStratejisi{
    @Override
    public void odemeYap(double miktar) {
        System.out.println("Banka karti ile odenen tutar: " + miktar);
    }
}

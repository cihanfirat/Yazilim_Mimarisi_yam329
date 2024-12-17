public class NakitOdeme implements IOdemeStratejisi{
    @Override
    public void odemeYap(double miktar) {
        System.out.println("Nakit ile odenen tutar: " + miktar);
    }
}

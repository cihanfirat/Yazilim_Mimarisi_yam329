public class PaypalOdeme implements IOdemeYontemi{
    @Override
    public void odemeYap(double tutar){
        System.out.println("Paypal ile Odeme Yapildi. Tutar: " + tutar);
    }
}

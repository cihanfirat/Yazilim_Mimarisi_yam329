public class KulaklikEklentisi  extends PhoneEklentiler{
    KulaklikEklentisi(IPhone phone){
        super(phone);
    }
    @Override
    public String phoneDetail(){
        return eklentiliPhone.phoneDetail() + " \'e kulaklik eklendi.";
    }
}

public class KilifEklentisi extends PhoneEklentiler{
    KilifEklentisi(IPhone phone){
        super(phone);
    }
    @Override
    public String phoneDetail(){
        return eklentiliPhone.phoneDetail() + " \'e kilif eklendi";
    }
}

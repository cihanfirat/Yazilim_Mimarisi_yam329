public class PhoneEklentiler implements IPhone{
    IPhone eklentiliPhone;
    PhoneEklentiler(IPhone phone){
        this.eklentiliPhone = phone;
    }
    @Override
    public String phoneDetail(){
        return eklentiliPhone.phoneDetail();
    }
}

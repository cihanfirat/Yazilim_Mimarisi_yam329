public class Main {

    public static void main(String[] args) {
        IPhone phone = new SimplePhone();
        IPhone phone2 = new SimplePhone();

        System.out.println(phone.phoneDetail() + " simple phone");
        phone = new KilifEklentisi(phone);
        System.out.println(phone.phoneDetail() + " kilifli telefon");

        phone2 = new KulaklikEklentisi(phone2);
        System.out.println(phone2.phoneDetail() + " kulaklikli telefon");
        phone = new KulaklikEklentisi(phone);
        System.out.println(phone.phoneDetail() +  " kilifli ve kulaklikli telefon");


    }
}

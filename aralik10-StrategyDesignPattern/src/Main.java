public class Main {
    public static void main(String[] args) {
        IOdemeYontemi oy = new BankaTransferiOdeme();
        Baglam baglam = new Baglam();
        baglam.setOdemeYontemi(oy);
        baglam.odemeyiTamamla(50.0);

        IOdemeYontemi oy2 = new PaypalOdeme();
        Baglam baglam2 = new Baglam();
        baglam2.setOdemeYontemi(oy2);
        baglam2.odemeyiTamamla(95);

        IOdemeYontemi oy3 = new BankaTransferiOdeme();
        Baglam baglam3 = new Baglam();
        baglam3.setOdemeYontemi(oy3);
        baglam3.odemeyiTamamla(75);
    }
}
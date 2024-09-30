public class App {
    public static void main(String[] args) throws Exception {

        Otomobil o1 = new Otomobil("Reanul", "Clio");
        o1.OtomobilGoruntule();

        Binek b1 = new Binek("Dacia", "Sandero");
        b1.YakitTuru = "Motorin";
        b1.BinekOtomobilGoruntule();

        TicariBinek t1 = new TicariBinek("Tofaş", "Kartal");
        t1.BagajKapasitesi = "250LT";
        t1.TicariBinekOtomobilGoruntule();
    }
}

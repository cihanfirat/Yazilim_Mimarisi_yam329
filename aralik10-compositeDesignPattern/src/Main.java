public class Main {
    public static void main(String[] args) {

        TekUrun Durum = new TekUrun("Dürüm",150.0);
        TekUrun Ayran = new TekUrun("Ayran",70.0);
        TekUrun Kahve = new TekUrun("Kahve",90.0);
        TekUrun Puding = new TekUrun("Puding", 65.0);
        TekUrun Sufle = new TekUrun("Sufle", 65.0);
        TekUrun Kazandibi = new TekUrun("Kazandibi", 65.0);
        TekUrun Trilece = new TekUrun("Trilece", 65.0);
        Puding.goster("-");
        Sufle.goster("-");
        Kazandibi.goster("-");
        Trilece.goster("-");
        System.out.println("*****************************************");

        MenuKategori mk = new MenuKategori("Ana Menu");
        MenuKategori mkİcecek = new MenuKategori("İcecek");
        MenuKategori mkSicakİcecekAltKategori = new MenuKategori("Sicak icecekler");
        MenuKategori mkSogukİcecekAltKategori = new MenuKategori("Soguk icecekler");

        mkİcecek.ekle(mkSicakİcecekAltKategori);
        mkİcecek.ekle(mkSogukİcecekAltKategori);

        mkSogukİcecekAltKategori.ekle(Ayran);
        mkSicakİcecekAltKategori.ekle(Kahve);

        MenuKategori mkYiyecek = new MenuKategori("Yiyecek");
        mkYiyecek.ekle(Durum);

        mk.ekle(mkİcecek);
        mk.ekle(mkYiyecek);

        mk.goster(" ->");
    }
}

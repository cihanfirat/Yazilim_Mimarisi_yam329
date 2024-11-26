package Siniflar;

public class SiparisYoneticisi {

    StokSistemi ss = new StokSistemi();
    BildirimSistemi bs = new BildirimSistemi();
    KargoSistemi ks = new KargoSistemi();

    public void siparisIsle(String urunKodu,int miktar,String eposta,String adres){
        if(ss.stokKontrolEt(urunKodu)){
            ss.stokGuncelle(urunKodu,-miktar);
            bs.siparisOnayiGonder(eposta);
            ks.kargoAyarla(adres);
            System.out.println("Siparis İsleniyor...");
            System.out.println("Siparis Basariyla İslendi!");
        }else {
            System.out.println("Geçersiz Urun Kodu veya urun stokta yok!");
        }
    }
}

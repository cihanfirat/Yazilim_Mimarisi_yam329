package Siniflar;

public class StokSistemi {
    protected boolean stokKontrolEt(String urunKodu){
        System.out.println("Stok Kontrol edildi: " + urunKodu);
        return true;
    }
    protected void stokGuncelle(String urunKodu,int miktar){
        System.out.println(urunKodu + " ürününün stogu guncellendi. Yeni miktar:"
        + miktar);
    }
}

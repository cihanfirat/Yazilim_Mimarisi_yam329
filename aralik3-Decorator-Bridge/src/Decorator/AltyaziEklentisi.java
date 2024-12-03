package Decorator;

public class AltyaziEklentisi extends VideoOynaticiDecorator{
    AltyaziEklentisi(VideoOynatici videoOynatici){
        super(videoOynatici);
    }
    public void oynat(String dosyaAdi){
        super.oynat(dosyaAdi);
        altyaziGoster();
    }
    public void altyaziGoster(){
        System.out.println("Altyazi eklendi.");
    }
}

package Decorator;

public class CozunurlukArtirici extends VideoOynaticiDecorator{
    CozunurlukArtirici(VideoOynatici videoOynatici){
        super(videoOynatici);
    }
    public void oynat(String dosyaAdi){
        super.oynat(dosyaAdi);
        cozunurlukArttir();
    }
    public void cozunurlukArttir(){
        System.out.println("Cozunurluk arttirildi.");
    }
}
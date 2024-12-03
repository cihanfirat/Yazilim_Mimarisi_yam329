package Decorator;

abstract class VideoOynaticiDecorator extends VideoOynatici{

    protected VideoOynatici videoOynatici;
    VideoOynaticiDecorator(VideoOynatici videoOynatici){
        super(videoOynatici.os);
        this.videoOynatici = videoOynatici;
    }

    public void oynat(String dosyaAdi){
        videoOynatici.oynat(dosyaAdi);
    }
}

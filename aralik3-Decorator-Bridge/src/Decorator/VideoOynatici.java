package Decorator;
import Bridge.*;

public class VideoOynatici {
   protected  IisletimSistemi os;
   VideoOynatici(IisletimSistemi os){
      this.os=os;
   }
   public void oynat(String dosyaAdi){
      os.islemiGerceklestir(dosyaAdi);
   }
}

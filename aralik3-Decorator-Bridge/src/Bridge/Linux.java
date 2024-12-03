package Bridge;

import Bridge.IisletimSistemi;

public class Linux implements IisletimSistemi {
    @Override
    public  void islemiGerceklestir(String dosyaAdi){
        System.out.println(dosyaAdi + " isimli medya Bridge.Linux uzerinde oynamaya basladi");
    }
}

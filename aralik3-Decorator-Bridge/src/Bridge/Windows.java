package Bridge;

import Bridge.IisletimSistemi;

public class Windows implements IisletimSistemi {
    @Override
    public void islemiGerceklestir(String dosyaAdi){
        System.out.println(dosyaAdi + " isimli medya Bridge.Windows uzerinde oynamaya basladi.");
    }
}

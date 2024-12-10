import java.util.ArrayList;
import java.util.List;

public class MenuKategori implements IMenuElemani{
    public String ad;
    public MenuKategori(String ad){
        this.ad = ad;
    }
    public List<IMenuElemani> elemanlar = new ArrayList<>();
    public void ekle(IMenuElemani eleman){
        elemanlar.add(eleman);
    }
    public void sil(IMenuElemani eleman){
        elemanlar.remove(eleman);
    }
    @Override
    public void goster(String girinti){
        System.out.println(girinti + " kategori: "
        + ad);
        for(IMenuElemani eleman : elemanlar){
            eleman.goster(girinti + " ");
        }
    }
}

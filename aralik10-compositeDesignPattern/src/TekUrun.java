public class TekUrun implements IMenuElemani{
    public String ad;
    public double fiyat;
    public TekUrun(String ad,double fiyat){
        this.ad=ad;this.fiyat=fiyat;
    }
    @Override
    public void goster(String girinti){
        System.out.println(girinti + " kategori: " + ad + " fiyat:" + fiyat);
    }
}

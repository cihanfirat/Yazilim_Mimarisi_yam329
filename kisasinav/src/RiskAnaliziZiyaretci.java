public class RiskAnaliziZiyaretci implements IZiyaretci{
    @Override
    public void ziyaretEt(Islem islem) {
        if(islem.getTur().getIsim()=="Kredi Basvurusu"){
            System.out.println("Kredi Kartı Departmani ziyaret edildi.");
        }
        else if(islem.getTur().getIsim()=="Para Transferi"){
            System.out.println("Para Transferi Departmani ziyaret edildi");
        }
        else{
            System.out.println("Böyle bir departman bulunamadı");
        }

    }
}

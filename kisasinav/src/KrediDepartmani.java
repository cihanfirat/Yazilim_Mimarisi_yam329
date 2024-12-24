public class KrediDepartmani extends Departman{
    IslemTuruFabrikasi itf = new IslemTuruFabrikasi();
    public boolean islemUygunMu(Islem islem){
        if(itf.getIslemTuru(islem.getTur().getIsim()).getIsim()=="Kredi Basvurusu"){
            return true;
        }return false;
    }
    public void islemIsle(Islem islem){
        if(islem.getTur().getIsim()=="Kredi Basvurusu"){
            System.out.println("Kredi Basvurusu: Sorun cozuluyor...");
        }else if(sonraki!=null){
            sonraki.islemYap(islem);
        }
    }
}

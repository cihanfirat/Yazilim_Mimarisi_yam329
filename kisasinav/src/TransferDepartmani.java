public class TransferDepartmani extends Departman{
    IslemTuruFabrikasi itf = new IslemTuruFabrikasi();
    public boolean islemUygunMu(Islem islem){
        if(itf.getIslemTuru(islem.getTur().getIsim()).getIsim()=="Para Transferi"){
            return true;
        }return false;
    }
    public void islemIsle(Islem islem){
        if(islem.getTur().getIsim()=="Para Transferi"){
            System.out.println("Para Transferi: Sorun cozuluyor...");
        }else if(sonraki!=null){
            sonraki.islemYap(islem);
        }
    }
}
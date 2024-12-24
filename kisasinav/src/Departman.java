abstract class Departman {
    protected Departman sonraki;
    public void setSonraki(Departman sonraki){
        this.sonraki = sonraki;
    }
    public void islemYap(Islem islem){
        System.out.println(islem.getTur().getIsim());
        System.out.println(islem.getDetaylar());
    }
    protected boolean islemUygunMu(Islem islem){
        return true;
    }
    protected void islemIsle(Islem islem){

    }
}

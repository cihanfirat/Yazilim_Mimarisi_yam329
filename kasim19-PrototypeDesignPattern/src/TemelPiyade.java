public class TemelPiyade implements IPiyade{
    private int saglik,saldiri,hiz;
    //nesneyi olustururken ilk olarak gelen base degerler
    //Oyun sırasında cagırılıp degistirilemez.
    TemelPiyade(int saglik,int saldiri,int hiz){
        this.saglik=saglik;this.saldiri=saldiri;this.hiz=hiz;
    }
    @Override
    public IPiyade birimKlonla() {

        try{
            return (IPiyade) this.clone(); //cast islemi
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void ozellikleriGoster() {
        System.out.println("Saglik: " + saglik +
                " ,Saldiri: " + saldiri + " ,Hiz: " + hiz);
    }

    //oyun sırasında degisen degerler.
    // Oyun sırasında cagırılıp degistirilebilir
    public void saglikAyarla(int saglik){
        this.saglik=saglik;
    }
    public void saldiriAyarla(int saldiri){
        this.saldiri=saldiri;
    }
    public void hizAyarla(int hiz){
        this.saldiri=saldiri;
    }
}

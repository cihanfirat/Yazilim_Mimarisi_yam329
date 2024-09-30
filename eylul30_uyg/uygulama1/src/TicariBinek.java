public class TicariBinek extends Binek {
    String BagajKapasitesi;
    TicariBinek(String Marka , String Model){
        super(Marka, Model);
    }
    public void TicariBinekOtomobilGoruntule(){
        System.out.println(this.Marka + " " + this.Model);
        System.out.println("Ticari binek otomobilin markası: " + this.Marka + 
        "\nTicari binek otomobilin modeli: " + this.Model +
        "\nTicari binek otomobilin bagaj kapasitesi: " + this.BagajKapasitesi);
    }
}

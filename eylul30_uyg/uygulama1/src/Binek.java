public class Binek extends Otomobil{
    String YakitTuru;
    Binek(String Marka, String Model){
        super(Marka, Model);
    }
    public void BinekOtomobilGoruntule(){
        System.out.println(this.Marka + " " + this.Model);
        System.out.println("Binek otomobilin markası: " + this.Marka + 
        "\nBinek otomobilin modeli: " + this.Model + 
        "\nBinek otomobilin yakıt türü: " + this.YakitTuru);
    }
}

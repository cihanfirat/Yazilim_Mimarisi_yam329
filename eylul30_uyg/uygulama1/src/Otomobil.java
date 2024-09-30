
public class Otomobil {
    String Marka,Model;
    Otomobil(String Marka, String Model){
        this.Marka=Marka;
        this.Model=Model;
    }
    public void OtomobilGoruntule(){
        System.out.println(this.Marka + " " + this.Model);
        System.out.println("Otomobilin markası: " + this.Marka + 
        " \nOtomobilin modeli: " + this.Model);
    }
}

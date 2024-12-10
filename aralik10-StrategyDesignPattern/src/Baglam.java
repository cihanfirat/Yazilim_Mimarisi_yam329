public class Baglam {
    private  IOdemeYontemi odemeYontemi;
    public void setOdemeYontemi(IOdemeYontemi odemeYontemi){
        this.odemeYontemi=odemeYontemi;
    }
    public void odemeyiTamamla(double tutar){
        odemeYontemi.odemeYap(tutar);
    }
}

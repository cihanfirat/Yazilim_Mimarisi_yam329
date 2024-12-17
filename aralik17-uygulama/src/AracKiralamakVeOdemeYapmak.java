public class AracKiralamakVeOdemeYapmak {

    public void aracKirala(String aracTipi){
        if(aracTipi == "sedan"){
            IAracFactory af1 = new SedanFactory();
            af1.içMekanUret();
            af1.lastigiUret();
            af1.motoruUret();
            System.out.println("sedan arac kiralandi");
        }
        else if(aracTipi == "suv"){
            IAracFactory af2 = new SUVFactory();
            af2.motoruUret();
            af2.lastigiUret();
            af2.içMekanUret();
            System.out.println("suv arac kiralandi");
        }
        else if(aracTipi=="spor araba"){
            IAracFactory af3 = new SporArabaFactory();
            af3.motoruUret();
            af3.içMekanUret();
            af3.lastigiUret();
            System.out.println("spor arac kiralandi");
        }else{
            System.out.println("geçersiz araba türü");
        }
    }
    public void odemeYap(String odemeTuru, double miktar){

        if(odemeTuru=="kredi kartı"){
            IOdemeStratejisi os1 = new KrediKartiOdeme();
            os1.odemeYap(miktar);
        }else if(odemeTuru == "banka kartı"){
            IOdemeStratejisi os2 = new BankaKartiOdeme();
            os2.odemeYap(miktar);
        }else if(odemeTuru == "nakit"){
            IOdemeStratejisi os3 = new NakitOdeme();
            os3.odemeYap(miktar);
        }else{
            System.out.println("gecersiz odeme stratejisi");
        }
    }
}

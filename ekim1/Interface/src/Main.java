public class Main {
    public static void main(String[] args){

        Arayuz1 s1 = new Sinif1();
        s1.fonksiyon1();
        String metin1 = s1.fonksiyon2();
        System.out.println(metin1);
        System.out.println(s1.isim);

        System.out.println("--------------------------------------------");

        Arayuz1 s2 = new Sinif2();
        s2.fonksiyon1();
        String metin2 = s2.fonksiyon2();
        System.out.println(metin2);

        //dikkat normalde solda arayuz sagda sınıf olurdu.
        // ancak burada Sinif2Fonksiyon'u Arayuz1 den alınmıyor.
        //Sinif2 nin kendi methodu
        Sinif2 s22 = new Sinif2();
        s22.Sinif2Fonksiyon();

        System.out.println("--------------------------------------------");

        Arayuz1 s3 = new Sinif3();
        s3.fonksiyon1();
        String metin3 = s3.fonksiyon2();
        System.out.println(metin3);
        int sayi1 = ((Sinif3) s3).fonksiyon3(); //added cast to s3
        System.out.println(sayi1);
        char char1 = ((Sinif3) s3).fonksiyon4(); //added cast to s3
        System.out.println(char1);
    }
}

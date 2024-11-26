import Odemeler.IOdemeYontemi;
import Odemeler.KrediKartiAdapter;
import Siniflar.SiparisYoneticisi;
// import Odemeler.* -> odemeler altındaki her seyi import eder.
public class Main {

    public static void main(String[] args) {
        SiparisYoneticisi sy = new SiparisYoneticisi();
        //sp.siparisIsle calısmadi cunku procted. public yapmalısın
        sy.siparisIsle("44ab34",5,"mymail@gmail.com",
                "bayrampasa");
        IOdemeYontemi oy = new KrediKartiAdapter();
        oy.odemeYap(55.5);
    }
}

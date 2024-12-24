import java.util.HashMap;
import java.util.Map;

public class IslemTuruFabrikasi{
    private static Map<String,IslemTuru> turler = new HashMap<>();
    public IslemTuru getIslemTuru(String isim){
        IslemTuru it = turler.get(isim);
        if(it == null){
            it = new IslemTuru(isim);
            turler.put(isim,it);
        }
        return it;
    }
}

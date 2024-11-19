import java.util.HashMap; //liste icin
import java.util.Map;

public class PiyadeRegistration {
    //string-> piyade id  value -> piyadenin kendisi
    private Map<String,IPiyade> piyadeMap = new HashMap<>();
    public void addPrototype(String key, IPiyade piyade){
        //maplerde ekleme için put
        //array ve listlerde?
        piyadeMap.put(key,piyade);
    }
    public IPiyade getPrototype(String key){
        IPiyade prototip = piyadeMap.get(key);
        //prototip bos degilse klonla
        return prototip!=null ? prototip.birimKlonla():null;
    }
}

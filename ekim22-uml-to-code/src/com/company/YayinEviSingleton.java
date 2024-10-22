package com.company;

public class YayinEviSingleton {
    public static YayinEviSingleton instance;
    private YayinEviSingleton(){
    }
    public static YayinEviSingleton getInstance(){
        if(instance==null){
            return new YayinEviSingleton();
        }else{
            return instance;
        }
    }
    public IKitapFabrikası getFabrika(String kitapTuru){
        if(kitapTuru=="EdebiEser"){
            IKitapFabrikası ikf = new KBY();
            return ikf;
        }
        else if (kitapTuru=="DersKitabi"){
            IKitapFabrikası ikf = new Pegem();
            return ikf;
        }
        else{
            return null;
        }
    }


}

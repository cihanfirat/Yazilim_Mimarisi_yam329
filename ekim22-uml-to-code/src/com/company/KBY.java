package com.company;

public class KBY implements IKitapFabrikası{
    //private IKitap Kitap;
    @Override
    public IKitap KitapBas() {
       return new EdebiEser();
    }
}

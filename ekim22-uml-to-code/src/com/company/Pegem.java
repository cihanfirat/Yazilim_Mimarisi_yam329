package com.company;

public class Pegem implements IKitapFabrikası{
    @Override
    public IKitap KitapBas() {
        return new DersKitabi();
    }
}

package com.company;
/*open-closed ve single-responsibilitye uygun
* */
public class SekilFabrikası { //factory
    public ISekilTuru SekilOlusturma(int sekilNumarasi){//createproduct
        if(sekilNumarasi==1)
            return new Dikdortgen();
        else if(sekilNumarasi==2)
            return new Daire();
        else
            return null;
    }
}

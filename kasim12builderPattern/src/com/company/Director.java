package com.company;

public class Director {
   // ElektrikliAracYap elektrikliScooter = new Scooter();
    public ElektrikliAracYap Aractipi(String type){
        if(type=="scooter"){
            return  new Scooter();
        }else if(type=="Minimotor"){
            return new MiniMotorsiklet();
        }else{
            return null;
        }
    }
    public void araciYap(ElektrikliAracYap arac){
        arac.direksiyonYap();
        arac.bataryaYap();
        arac.motorYap();
        arac.tekerlekYap();
    }
}

package com.company;

import java.lang.constant.Constable;

public class SommerGræs {
    double længdNu;
    double længdemax;

    public SommerGræs(double længdNu, double længdemax){
        this.længdNu=længdNu;
        this.længdemax=længdemax;
    }

    public void setLængdNu(double længdNu) {this.længdNu = længdNu;}

    public void setLængdemax(double længdemax) {this.længdemax = længdemax;}

    public double getLængdNu() {return længdNu;}

    public double getLængdemax() {return længdemax;}

    public double totaldage(){
        if(længdNu<længdemax){
            double totaldage= længdNu/0.8;

            return totaldage;

        }
        else{ System.out.println("Græsset overstiger max længde og skal slås nu!!!!##¤¤¤%&&!!!");

        }
        return 0.0;
    }
}

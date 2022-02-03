package com.company;

import java.util.ArrayList;

public class Bibliotek {

    ArrayList<Bog> biblolist;


    public Bibliotek(ArrayList<Bog> biblolist){
        this.biblolist = biblolist;
    }

    public boolean equalsiSBN(Bog bog4) {

        for(int i=0; i< biblolist.size();i++){
            if(biblolist.get(i).getiSBN()== bog4.getiSBN()){
                System.out.println("yas den har");
                return true;
            }

        }

        System.out.println("false det har den noooootttttt");
        return false;
    }


}

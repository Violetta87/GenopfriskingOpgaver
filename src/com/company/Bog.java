package com.company;

public class Bog {

    private int iSBN;
    private String titel;
    private int udgivelsesår;

    public Bog(int iSBN, String titel, int udgivelsesår){
        this.iSBN = iSBN;
        this.titel=titel;
        this.udgivelsesår=udgivelsesår;

    }


    public void setiSBN(int iSBN) {this.iSBN = iSBN;}

    public void setTitel(String titel) {this.titel = titel;}

    public void setUdgivelsesår(int udgivelsesår) {this.udgivelsesår = udgivelsesår;}

    public int getiSBN(){return iSBN;}

    public String getTitel() {return titel;}

    public int getUdgivelsesår() {return udgivelsesår;}

    @Override
    public String toString() {
        return "ISBN-nummer: "+iSBN+ "\ntitel: "+titel+"\nudgivelsesår: "+udgivelsesår;
    }
}

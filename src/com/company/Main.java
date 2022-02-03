package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Main {

    static Scanner scan = new Scanner(System.in);

    static ArrayList<String> list = new ArrayList<>(Arrays.asList("tis", "manny", "hummus", "salt", "pige"));
    static ArrayList<Bog> listbiblo = new ArrayList<>();



    public static void main(String[] args) {

        doesArraylistContainString();

        bogOp();

        slåGræs();

        kvadratOpgave();

        properCase("hej MED dig assssholleeeee");

        sortering1();

        sortering2();

        System.out.println(søgning("tissemyre", list));

    }

    public static boolean doesArraylistContainString() {

        System.out.println("Opgave 1: array sortering"+"\n*******");

        System.out.println("Skriv et ord, og vi undersøger om det findes i vores liste");
        String streng = scan.next();

        for (int i = 0; i < list.size(); i++) {
            if (streng.equals(list.get(i))) {

                System.out.println("the String has been found");
                return true;
            }

        }
        System.out.println("the string has not been found");
        return false;
    }

    public static void bogOp() {

        System.out.println("opgave 2: bog:"+"\n*******");

        Bog nybog1 = new Bog(56468584, "Tissemyre", 2006);
        listbiblo.add(nybog1);
        Bog nybog2 = new Bog(68578485, "Marmorkirke", 2011);
        listbiblo.add(nybog2);
        Bog nybog3 = new Bog(28117190, "Brækbogen", 2015);
        listbiblo.add(nybog3);

        Bibliotek bibliotek = new Bibliotek(listbiblo);

        Bog nybog4 = new Bog(567820, "kald det mati", 2020);
        Bog nybog5 = new Bog(28117190, "Tissebogen", 2016);

        System.out.println("Har\"kald det mati\" det samme ISBN som en af vores bøger bibliotekslisten");

        System.out.println(bibliotek.equalsiSBN(nybog4));
        System.out.println("Har \"Tissebogen\" det samme ISBN som en af vores bøger fra bibliotekslisten <3");
        System.out.println(bibliotek.equalsiSBN(nybog5));

    }

    public static void slåGræs() {

        System.out.println("opgave 3: slågræs"+"\n*******");

        System.out.println("skriv græslængde");

        /*Opgave 3 - græsset slås*/

        double græslængd = scan.nextDouble();
        SommerGræs nySommer = new SommerGræs(græslængd, 4.8);

        int a = (int) Math.round(nySommer.totaldage());

        System.out.println("Der er " + " " + a + " " + "dag(e) til du skal slå græsset");
    }


    public static void kvadratOpgave() {

        System.out.println("Opgave 4: kvadratopgave"+ "\n********");

        System.out.println("Hvor mange rækker stjerner skal printes ud?");
        int answer = scan.nextInt();
        System.out.println("Hvor mange stjerner skal printes ud i hver rækker?");
        int answer2 = scan.nextInt();
        System.out.println("Hvilken tegn vil du have?");
        String tegn = scan.next();

        for (int i = 0; i < answer; i++) {
            for (int j = 0; j < answer2; j++) {
                System.out.print(tegn);
                System.out.print("  ");
            }
            System.out.println();
        }


    }

    public static void properCase(String s) {

        System.out.println("Opgave 5: propercase"+"\n*******");

        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {

            if (words[i].substring(0) == words[i].toUpperCase()) {
                String sNyy = words[i].substring(0).toUpperCase();
                words[i] = sNyy;
            } else if (words[i].length() > 3) {
                String sNY = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
                words[i] = sNY;
            } else if (words[i].length() <= 3) {
                String sNyyy = words[i].substring(0).toLowerCase();
                words[i] = sNyyy;
            }
        }
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();

    }

    public static void sortering1() {

        System.out.println("Opgave 6: sortering"+"\n*******");

        ArrayList<String> nylist = new ArrayList<>();
        String ordIndtastet;
        do {
            System.out.println("skriv 1 ord");
            ordIndtastet = scan.nextLine();
            nylist.add(ordIndtastet);
            System.out.println(nylist);


        } while (ordIndtastet != "");

        nylist.remove("");
        Collections.sort(nylist);
        System.out.print(nylist);
    }

    public static void sortering2() {

        System.out.println("Opgave 6 sortering"+"\n*******");

        ArrayList<String> listSort = new ArrayList<>(Arrays.asList("abe", "næse", "lort", "mund", "nej"));

        Collections.sort(listSort);
        System.out.println(listSort);

    }

       public static int søgning(String ord,ArrayList<String> listNY){

        System.out.println("Opgave:7 søgning"+"\n*******");

        for(int i=0; i <listNY.size();i++){
            if(ord.equals(listNY.get(i))){
                System.out.println(i);
                return i;
            }
        }

        return -1;
        }

}








package com.forEach;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<String> combo = new ArrayList<String>();

        names.add("cup");
        names.add("glass");
        names.add("phone");
        names.add("mouse");
        names.add("calendar");

        String[] names2 = {"table", "chair", "floor", "window", "passport"};

        int[] a = {1, 2, 3, 4, 5};

        for(String i: names){
                words.add(i);
        }

        for(String j : names) {
            for(String k : words) {
                combo.add(j + " " + k);
            }
        }

        for (String i : combo){
            System.out.println(i);
        }

        for(int i : a){
            System.out.println(i);
        }

        //For-each ciklā katru reizi tiek veidots jauns mainīgais (String i), kura tipam ir jāsakrīt ar lauka elementa tipu. Ja ArrayList<String>, tad String i.
        //Katrā ciklā izveidotajam mainīgajam tiek piešķirta attiecīgā lauka mainīgā reference.
        //For-each cikls taisa autoincrement backgroundā.
        //For-each nevar izmantot gadījumos, kad nepieciešams zināt iterācijas numuru i.

//        for(int i = 0; i < names.size(); i++) {
//            names.set(i, "null");
//        }
//
//        for(int i = 0; i < names.size(); i++) {
//            System.out.println(names.get(i));
//        }
    }
}

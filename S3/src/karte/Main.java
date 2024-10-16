package karte;

//import enum_karte.Deck;
//import enum_karte.Karte;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Karte> karten= Stream.of("Pik","Kreuz","Herz","Karo")
                .flatMap(farbe-> IntStream.range(1,14).mapToObj(wert->new Karte(farbe,wert))).toList();
        List<String> farben=List.of("Pik","Kreuz","Herz","Karo");
        List<Integer> werten=List.of(1,2,3,4,5,6,7,8,9,10,11,12,13);
        List<Karte> karten2=new ArrayList<>();
        //Alterantive fur den flatmap
        for(String farbe: farben){
            for(int wert: werten) {
                karten2.add(new Karte(farbe, wert));
            }
        }
        Deck deck=new Deck(karten);
        for(Karte k: deck){
            System.out.println(k);
        }
    }
}
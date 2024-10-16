package karte;

public class Karte {
    private String farbe;
    private int wert;

    public Karte(String farbe,int wert){
        this.farbe=farbe;
        this.wert=wert;
    }

    public String getFarbe(){
        return farbe;
    }
    public int getWert(){
        return wert;
    }

    @Override
    public String toString() {
        return "Karte{" +
                "farbe='" + farbe + '\'' +
                ", wert=" + wert +
                '}';
    }
}

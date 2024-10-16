package enum_karte;

public class Karte {
    private Farbe farbe;
    private Wert wert;

    public Karte(Farbe farbe,Wert wert){
        this.farbe=farbe;
        this.wert=wert;
    }

    public Farbe getFarbe(){
        return farbe;
    }
    public Wert getWert(){
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

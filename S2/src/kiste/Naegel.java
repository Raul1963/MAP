package kiste;

public class Naegel implements Sache {


    @Override
    public String toString() {
        return "kiste.Naegel{}";
    }

    @Override
    public double getWeight() {
        return 2;
    }

    @Override
    public boolean canCut() {
        return false;
    }

}

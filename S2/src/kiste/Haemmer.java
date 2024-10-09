package kiste;

public class Haemmer implements Sache{
    double weight;

    public Haemmer(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "kiste.Haemmer{" +
                "weight=" + weight +
                '}';
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public boolean canCut() {
        return false;
    }
}

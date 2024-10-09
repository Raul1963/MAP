package kiste;

public class Scheren implements Sache{
    double weight;

    public Scheren(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "kiste.Scheren{" +
                "weight=" + weight +
                '}';
    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public boolean canCut() {
        return false;
    }
}

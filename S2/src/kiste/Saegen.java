package kiste;

public class Saegen implements Sache{
    double weight;

    public Saegen(double weight){
        this.weight=weight;
    }

    @Override
    public String toString() {
        return "kiste.Saegen{" +
                "weight=" + weight +
                '}';
    }

    @Override
    public double getWeight(){
        return this.weight;
    }

    @Override
    public boolean canCut() {
        return true;
    }

}

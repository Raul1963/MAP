package kiste;

import java.util.ArrayList;
import java.util.List;
public class Kiste {
    List<Sache> sacheArray=new ArrayList<>();

    @Override
    public String toString() {
        return "kiste.Kiste{" +
                "sacheArray=" + sacheArray +
                '}';
    }

    public void add(Sache sache){
        sacheArray.add(sache);
    }

    public List<Sache> heavyObjects(){
        return sacheArray.stream().filter(sache->sache.getWeight()>1).toList();
    }

    public List<Sache> canCut(){
        return sacheArray.stream().filter(Sache::canCut).toList();
    }
}

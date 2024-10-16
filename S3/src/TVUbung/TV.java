package TVUbung;

import java.util.List;
import java.util.ListIterator;

public class TV implements ListIterator<Kanale> {
    List<Kanale> kanaleliste;
    int index=0;
    public TV(List<Kanale> kanaleliste){
        this.kanaleliste=kanaleliste;
    }

    @Override
    public boolean hasNext() {
        return kanaleliste.size()>index+1;
    }

    @Override
    public Kanale next() {
        if(hasNext()) {
            return kanaleliste.get(index++);
        }
        else{
            return null;
        }
    }

    @Override
    public boolean hasPrevious() {
        return index>0;
    }

    @Override
    public Kanale previous() {
        if(hasPrevious()) {
            return kanaleliste.get(index--);
        }
        else {
            return null;
        }
    }

    @Override
    public int nextIndex() {
        return index+1;
    }

    @Override
    public int previousIndex() {
        return index-1;
    }

    @Override
    public void remove() {
        kanaleliste.remove(index);
    }

    @Override
    public void set(Kanale kanale) {
        kanaleliste.set(index,kanale);
    }

    @Override
    public void add(Kanale kanale) {
        kanaleliste.add(index,kanale);
    }
}

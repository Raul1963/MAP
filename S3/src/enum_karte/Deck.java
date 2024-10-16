package enum_karte;

import java.util.Iterator;
import java.util.List;

public class Deck implements Iterable<Karte>{
    private final List<Karte> karten;
    public Deck(List<Karte> karten){
        this.karten=karten;
    }
    @Override
    public Iterator<Karte> iterator() {
        return new KarteIterator(karten);
    }

    public class KarteIterator implements Iterator<Karte>{

        private List<Karte> karten;
        private int position=0;

        public  KarteIterator(List<Karte> karten){
            this.karten=karten;
        }
        @Override
        public boolean hasNext() {
            return karten.size()>position+1;
        }

        @Override
        public Karte next() {
            return karten.get(position++);
        }
    }
}

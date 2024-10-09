package Cinema;

import java.util.List;

public class SciFi extends Movie{
    public SciFi(String title, int year, double rating, List<String> casting, double baseprice) {
        super(title, year, rating, casting, baseprice);
    }

    @Override
    public double calculatePrice() {
        return baseprice;
    }
}

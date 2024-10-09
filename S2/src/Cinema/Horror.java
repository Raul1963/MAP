package Cinema;

import java.util.List;

public class Horror extends Movie{

    public Horror(String title, int year, double rating, List<String> casting, double baseprice) {
        super(title, year, rating, casting, baseprice);
    }

    @Override
    public double calculatePrice() {
        return baseprice*0.9;
    }
}

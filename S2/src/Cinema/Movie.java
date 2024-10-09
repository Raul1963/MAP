package Cinema;

import java.util.List;

public abstract class Movie {
    String title;
    int year;
    double rating;

    List<String> casting;

    public Movie(String title, int year, double rating, List<String> casting, double baseprice) {
        this.title = title;
        this.year = year;
        this.rating = rating;
        this.casting = casting;
        this.baseprice = baseprice;
    }

    double baseprice;
    public abstract double calculatePrice();
}

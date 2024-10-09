package Cinema;

public class OrderLine {
    public OrderLine(Movie movie, int quantity) {
        this.movie = movie;
        this.quantity = quantity;
    }

    Movie movie;
    int quantity;

    public double calculatePrice(){
        return movie.calculatePrice()*quantity;
    }
}

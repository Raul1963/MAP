package Cinema;

import java.util.List;

public class User {
    String firstName;
    String lastName;
    List<Order> orders;

    public User(String firstName, String lastName, List<Order> orders) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.orders = orders;
    }

    public double calculateTotalPrice(){
        double total=0;
        for(Order order: orders){
            total=order.calculateTotalPrice();
        }
        return total;
    }
}
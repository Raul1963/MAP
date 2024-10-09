package Cinema;

import java.util.Date;
import java.util.List;

public class Order {
    Date date;
    List<OrderLine> orderLines;

    public Order(Date date, List<OrderLine> orderLines) {
        this.date = date;
        this.orderLines = orderLines;
    }

    public double calculateTotalPrice(){
        double res=0;
        for(OrderLine l: orderLines){
            res+=l.calculatePrice();
        }
        return res;
    }
}

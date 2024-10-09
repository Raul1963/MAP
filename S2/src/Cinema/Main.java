package Cinema;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Movie m1=new Comedy("aasf",2000,5.0, List.of("asfg","asfa"),20.0);
        Movie m2=new Horror("vaab",2010,1.0, List.of("asfg","asfa"),20.0);
        Movie m3=new SciFi("dabs",2020,5.0, List.of("asfg","asfa"),20.0);
        Movie m4=new Horror("asdb",2005,5.0, List.of("asfg","asfa"),20.0);
        Movie m5=new SciFi("aassdf",2006,5.0, List.of("asfg","asfa"),20.0);

        Order order=new Order(new Date(1728470953),List.of(new OrderLine(m1,5),new OrderLine(m4,2),new OrderLine(m2,4)));
        User user=new User("Raul","Paul",List.of(order));

        System.out.println(user.calculateTotalPrice());
    }
}

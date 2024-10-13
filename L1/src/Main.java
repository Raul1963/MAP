import java.util.List;
import Aufgabe4.*;
import Tests.*;

public class Main {
    public static void main(String[] args) {
        Test1 t1=new Test1();
        t1.test_all1(List.of(29,37,38,41,84,67));
        Test2 t2=new Test2();
        t2.test_all2(List.of(4,8,3,10,17));
        Test3 t3=new Test3();
        t3.test_all3(List.of(1,3,0,0,0,0,0,0,0),List.of(8,7,0,0,0,0,0,0,0),List.of(8,3,0,0,0,0,0,0,0),List.of(5,4,0,0,0,0,0,0,0),List.of(2,3,6,0,0,0,0,0,0),2);
        Test4 t4=new Test4();
        t4.test_cheapestKeyboard(List.of(40,35,70,15,45));
        t4.test_getMostExpensiveDevice(List.of(15,20,10,35),List.of(20,15,40,15));
        t4.test_mostExpesiveUsbforBudget(List.of(15,45,20),30);
        t4.test_mostExpenisiveDevicesforBudget(List.of(40,50,60),List.of(8,12),60);
        t4.test_mostExpenisiveDevicesforBudget(List.of(60),List.of(8,12),60);
        t4.test_mostExpenisiveDevicesforBudget(List.of(40,60),List.of(8,12),60);
    }
}
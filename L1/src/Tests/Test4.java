package Tests;
import Aufgabe4.*;

import java.util.List;

public class Test4 {
    public void test_cheapestKeyboard(List<Integer> keyboards){
        Devices kb=new Keyboards(keyboards);
        ElectronicShop ec=new ElectronicShop();
        System.out.println(ec.getCheapestKeyboard(kb));
    }
    public void test_getMostExpensiveDevice(List<Integer> keyboards,List<Integer> usb_units){
        Devices kb=new Keyboards(keyboards);
        Devices usb=new USB_Units(usb_units);
        ElectronicShop ec=new ElectronicShop();
        System.out.println(ec.getMostExpensiveDevice(kb,usb));
    }
    public void test_mostExpesiveUsbforBudget(List<Integer> usb_units,int budget){
        Devices usb=new USB_Units(usb_units);
        ElectronicShop ec=new ElectronicShop();
        System.out.println(ec.mostExpensiveUSBforBudget(usb,budget));
    }
    public void test_mostExpenisiveDevicesforBudget(List<Integer> keyboards,List<Integer> usb_units,int budget){
        Devices kb=new Keyboards(keyboards);
        Devices usb=new USB_Units(usb_units);
        ElectronicShop ec=new ElectronicShop();
        System.out.println(ec.mostExpenisiveDevicesforBudget(kb,usb,budget));
    }
}

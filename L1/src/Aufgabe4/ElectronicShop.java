package Aufgabe4;

public class ElectronicShop {


    public int getCheapestKeyboard(Devices keyboards){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<keyboards.prices.size();i++){
            min=Math.min(min,keyboards.prices.get(i));
        }
        return min;
    }
    public int getMostExpensiveDevice(Devices keyboards,Devices usb_units){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<keyboards.prices.size();i++){
            max=Math.max(max,keyboards.prices.get(i));
        }
        for(int i=0;i<usb_units.prices.size();i++){
            max=Math.max(max,usb_units.prices.get(i));
        }
        return max;
    }
    public int mostExpensiveUSBforBudget(Devices usb_units,int budget){
        int maxUSB_budget=0;
        for(int i=0;i<usb_units.prices.size();i++){
            if(budget-usb_units.prices.get(i)>=0){
                maxUSB_budget=Math.max(maxUSB_budget,usb_units.prices.get(i));
            }
        }
        return maxUSB_budget;
    }

    public int mostExpenisiveDevicesforBudget(Devices keyboards, Devices usb_units,int budget){

        int current=0,max=-1;
        for(int i=keyboards.prices.size()-1;i>=0;i--){
            if(budget-keyboards.prices.get(i)>0){
                current=keyboards.prices.get(i);
                for(int j=usb_units.prices.size()-1;j>=0;j--){
                    if(current+usb_units.prices.get(j)<=budget){
                        max=Math.max(max,current+usb_units.prices.get(j));
                    }
                }
            }
        }
        return max;
    }
}

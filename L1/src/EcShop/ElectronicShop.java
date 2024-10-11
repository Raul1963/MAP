package EcShop;

public class ElectronicShop {
    int budget;

    public ElectronicShop(int budget) {
        this.budget = budget;
    }

    public int getCheapestKeyboard(Keyboards keyboards){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<keyboards.prices.get(i);i++){
            min=Math.min(min,keyboards.prices.get(i));
        }
        return min;
    }
    public int getMostExpensiveDevice(Keyboards keyboards,USB_Units usb_units){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<keyboards.prices.get(i);i++){
            max=Math.max(max,keyboards.prices.get(i));
        }
        for(int i=0;i<usb_units.prices.get(i);i++){
            max=Math.max(max,keyboards.prices.get(i));
        }
        return max;
    }
}

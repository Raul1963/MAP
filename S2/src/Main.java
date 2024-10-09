import kiste.Haemmer;
import kiste.Kiste;
import kiste.Naegel;
import strategy.*;

public class Main {
    public static void main(String[] args) {
//        Kiste kiste=new Kiste();
//        kiste.add(new Haemmer(1.2));
//        kiste.add(new Haemmer(0.8));
//        kiste.add(new Naegel());
//        kiste.add(new Naegel());
//        kiste.add(new Naegel());
////        kiste.sacheArray=kiste.heavyObjects();
//        System.out.println(kiste.toString());
        String math="3*2-1";
        double acc=Double.parseDouble(math.substring(0,1));
        for(int i=1;i<math.length();i+=2){
            if(i%2==1){
                acc=getStrategy(math.charAt(i)).op(acc,Double.parseDouble(math.substring(i+1,i+2)));
            }
        }
        System.out.println(acc);
    }

    static MathStrategy getStrategy(char c){
         return switch(c){
            case '+'-> new AddStrategy();
            case '-'-> new SubStrategy();
            case '*'-> new MulStrategy();
            case '/'-> new DivStrategy();
            default-> null;
        };
    }
}
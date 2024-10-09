import java.util.ArrayList;
import java.util.List;

public class BigNumsOp {
    List<Integer> bigNum;

    public BigNumsOp(List<Integer> bigNum) {
        this.bigNum = bigNum;
    }

    public List<Integer> sum(List<Integer> bigNum2) {
        List<Integer> result=new ArrayList<>();
        int ok=0;
        for(int i=bigNum2.size()-1;i>=0;i--){
            int newNum=bigNum.get(i)+bigNum2.get(i)+ok;
            ok=newNum/10;
            newNum%=10;
            result.add(newNum);
        }
        if(ok==1){
            result.add(1);
        }
        return result.reversed();
    }
    public List<Integer> dif(List<Integer> bigNum2) {
        List<Integer> result=new ArrayList<>();
        int ok=0;
        for(int i=bigNum2.size()-1;i>=0;i--){
            int newNum=0;
            if(bigNum.get(i)-ok<bigNum2.get(i)){
                newNum=10-(bigNum2.get(i)-bigNum.get(i));
                if(ok==0) {
                    ok--;
                }
            }
            else {
                newNum = bigNum.get(i) - bigNum2.get(i) - ok;
                ok=0;
            }
            result.add(newNum);
        }
        if(ok==-1){
            result.remove(result.size()-1);
        }
        return result.reversed();
    }
    public List<Integer> mul(int coeff) {
        List<Integer> result=new ArrayList<>();
        int ok=0;
        for(int i=bigNum.size()-1;i>=0;i--){
            int newNum=bigNum.get(i)*coeff+ok;
            ok=newNum/10;
            newNum%=10;
            result.add(newNum);
        }
        if(ok!=0){
            result.add(ok);
        }
        return result.reversed();
    }

    public List<Integer> div(int coeff) {
        List<Integer> result=new ArrayList<>();
        int ok=0;
        for(int i=bigNum.size()-1;i>=0;i--){
            int newNum=bigNum.get(i)/coeff-ok;
            ok=newNum/10;
            newNum%=10;
            result.add(newNum);
        }
        if(ok!=0){
            result.add(ok);
        }
        return result.reversed();
    }
}

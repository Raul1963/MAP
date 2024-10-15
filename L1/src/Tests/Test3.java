package Tests;
import Aufgabe3.BigNumsOp;

import java.util.List;

public class Test3 {
    public void test_sum(List<Integer> bigNum1,List<Integer> bigNum2){
        BigNumsOp bno=new BigNumsOp(bigNum1);
        System.out.println("The sum is: "+bno.sum(bigNum2));
    }
    public void test_dif(List<Integer> bigNum1,List<Integer> bigNum2){
        BigNumsOp bno=new BigNumsOp(bigNum1);
        System.out.println("The difference is: "+bno.dif(bigNum2));
    }
    public void test_mul(List<Integer> bigNum1,int coeff){
        BigNumsOp bno=new BigNumsOp(bigNum1);
        System.out.println("The multiplication is: "+bno.mul(coeff));
    }
    public void test_div(List<Integer> bigNum1,int coeff){
        BigNumsOp bno=new BigNumsOp(bigNum1);
        System.out.println("The division is: "+bno.div(coeff));
    }
}

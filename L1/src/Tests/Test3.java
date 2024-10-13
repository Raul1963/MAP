package Tests;
import Aufgabe3.BigNumsOp;

import java.util.List;

public class Test3 {
    public void test_sum(List<Integer> bigNum1,List<Integer> bigNum2){
        BigNumsOp bno=new BigNumsOp(bigNum1);
        System.out.println(bno.sum(bigNum2));
    }
    public void test_dif(List<Integer> bigNum1,List<Integer> bigNum2){
        BigNumsOp bno=new BigNumsOp(bigNum1);
        System.out.println(bno.dif(bigNum2));
    }
    public void test_mul(List<Integer> bigNum1,int coeff){
        BigNumsOp bno=new BigNumsOp(bigNum1);
        System.out.println(bno.mul(coeff));
    }
    public void test_div(List<Integer> bigNum1,int coeff){
        BigNumsOp bno=new BigNumsOp(bigNum1);
        System.out.println(bno.div(coeff));
    }
    public void test_all3(List<Integer> bigNum1,List<Integer> bigNum2,List<Integer> bigNum3,List<Integer> bigNum4,List<Integer> bigNum5,int coeff){
        test_sum(bigNum1,bigNum2);
        test_dif(bigNum3,bigNum4);
        test_mul(bigNum5,coeff);
        test_div(bigNum5,coeff);
    }
}

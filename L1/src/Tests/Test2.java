package Tests;
import Aufgabe2.ArrayOp;

import java.util.List;

public class Test2 {
    public void test_maxNumber(List<Integer> numbers){
        ArrayOp ao=new ArrayOp(numbers);
        System.out.println(ao.maxNumber());
    }
    public void test_minNumber(List<Integer> numbers){
        ArrayOp ao=new ArrayOp(numbers);
        System.out.println(ao.minNumber());
    }
    public void test_maxSum(List<Integer> numbers){
        ArrayOp ao=new ArrayOp(numbers);
        System.out.println(ao.maxSum());
    }
    public void test_minSum(List<Integer> numbers){
        ArrayOp ao=new ArrayOp(numbers);
        System.out.println(ao.minSum());
    }

    public void test_all2(List<Integer> numbers){
        test_maxNumber(numbers);
        test_minNumber(numbers);
        test_maxSum(numbers);
        test_minSum(numbers);
    }
}

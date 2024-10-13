package Aufgabe2;

import java.util.List;

public class ArrayOp {
    List<Integer> numbers;

    public ArrayOp(List<Integer> numbers) {
        this.numbers = numbers;
    }
    public int maxNumber(){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<numbers.size();i++){
            max=Math.max(max,numbers.get(i));
        }
        return max;
    }
    public int minNumber(){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<numbers.size();i++){
            min=Math.min(min,numbers.get(i));
        }
        return min;
    }
    public int maxSum(){
        int min=minNumber(), sum=0;
        boolean found=false;
        for(int i=0;i<numbers.size();i++){
            if(numbers.get(i)==min && !found){
                found=true;
                continue;
            }
            else{
                sum+=numbers.get(i);
            }
        }
        return sum;
    }

    public int minSum(){
        int max=maxNumber(), sum=0;
        boolean found=false;
        for(int i=0;i<numbers.size();i++){
            if(numbers.get(i)==max && !found){
                found=true;
                continue;
            }
            else{
                sum+=numbers.get(i);
            }
        }
        return sum;
    }
}

package Aufgabe1;

import java.util.ArrayList;
import java.util.List;

public class University {

    public List<Integer> tooLowGrades(List<Integer> grades){
        List<Integer> tooLowGrades=new ArrayList<>();
        for(int i=0;i<grades.size();i++){
            if(grades.get(i)<=38){
                tooLowGrades.add(grades.get(i));
            }
        }
        return tooLowGrades;
    }

    public double averageGrade(List<Integer> grades){
        double average=0;
        for(int i=0;i<grades.size();i++){
            average+= grades.get(i);
        }
        return Math.round(average/grades.size()*100.0)/100.0;
    }
    public List<Integer> roundedGrades(List<Integer> grades){
        List<Integer> roundedGrades=new ArrayList<>(grades);
        for(int i=0;i<grades.size();i++){
//            if(grades.get(i)<38){
////                roundedGrades.add(grades.get(i));;
//                continue;
//            }
            if(grades.get(i)>=38 && grades.get(i)%5>=3){
                roundedGrades.set(i,grades.get(i)+5-grades.get(i)%5);
            }
//            else{
//                roundedGrades.add(grades.get(i));
//            }
        }
        return roundedGrades;
    }
    public int maxRoundedGrade(List<Integer> grades){
        int maxGrade=Integer.MIN_VALUE;
        for(int i=0;i<grades.size();i++){
            if(grades.get(i)<=38){
                continue;
            }
            else if(grades.get(i)%5>=3){
               maxGrade= Integer.max( maxGrade,grades.get(i)+5-grades.get(i)%5);
            }
        }
        return maxGrade;
    }


}

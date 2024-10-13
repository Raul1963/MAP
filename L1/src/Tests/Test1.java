
package Tests;
import Aufgabe1.University;

import java.util.List;

public class Test1 {
    public void test_tooLowGrades(List<Integer> grades){
        University u=new University(grades);
        System.out.println(u.tooLowGrades());
    }
    public void test_averageGrade(List<Integer> grades){
        University u=new University(grades);
        System.out.println(u.averageGrade());
    }
    public void test_roundedGrades(List<Integer> grades){
        University u=new University(grades);
        System.out.println(u.roundedGrades());
    }
    public void test_maxRoundedGrade(List<Integer> grades){
        University u=new University(grades);
        System.out.println(u.maxRoundedGrade());
    }
    public void test_all1(List<Integer> grades){
        test_tooLowGrades(grades);
        test_averageGrade(grades);
        test_roundedGrades(grades);
        test_maxRoundedGrade(grades);
    }
}

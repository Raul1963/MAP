
package Tests;
import Aufgabe1.University;

import java.util.List;

public class Test1 {
    public void test_tooLowGrades(List<Integer> grades){
        University u=new University();
        System.out.println("The lower grades are: " + u.tooLowGrades(grades));
    }
    public void test_averageGrade(List<Integer> grades){
        University u=new University();
        System.out.println("The average grade is: "+u.averageGrade(grades));
    }
    public void test_roundedGrades(List<Integer> grades){
        University u=new University();
        System.out.println("The rounded grades are: "+u.roundedGrades(grades));
    }
    public void test_maxRoundedGrade(List<Integer> grades){
        University u=new University();
        System.out.println("The maxinum rounded grade is: "+u.maxRoundedGrade(grades));
    }
    public void test_all1(List<Integer> grades){
        test_tooLowGrades(grades);
        test_averageGrade(grades);
        test_roundedGrades(grades);
        test_maxRoundedGrade(grades);
    }
}

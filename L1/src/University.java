import java.util.ArrayList;
import java.util.List;

public class University {
    List<Integer> grades;

    public University(List<Integer> grades) {
        this.grades = grades;
    }
    public List<Integer> tooLowGrades(){
        List<Integer> lowGrades= grades.stream().filter(grades->grades<=38).toList();
        return lowGrades;
    }

    public double averageGrade(){
        double average=0;
        for(int i=0;i<grades.size();i++){
            average+= grades.get(i);
        }
        return Math.round(average/grades.size()*100.0)/100.0;
    }
    public List<Integer> roundedGrades(){
        List<Integer> roundedGrades= new ArrayList<Integer>();
        for(int i=0;i<grades.size();i++){
            if(grades.get(i)<=38){
                roundedGrades.add(grades.get(i));
                continue;
            }
            else if(grades.get(i)%5>=3){
                roundedGrades.add(grades.get(i)+5-grades.get(i)%5);
            }
        }
        return roundedGrades;
    }
    public int maxRoundedGrade(){
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

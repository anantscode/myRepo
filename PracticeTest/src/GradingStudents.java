import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args){
        List<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
        List<Integer> resultList = gradingStudents(grades);
        for (int result : resultList){
            System.out.println(result);
        }
    }
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> listResult = new ArrayList<>();
        for (int grade:grades){
            int remain = grade%5;
            int calNum = 5-remain;
            int gVal = grade+calNum;
            int cal = gVal-grade;
            if (grade<38){
                listResult.add(grade);
            }else if(cal <3){
                listResult.add(gVal);
            }else if(cal>=3){
                listResult.add(grade);
            }
        }
        return listResult;
    }
}
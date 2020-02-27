import java.io.IOException;
import java.util.Arrays;

public class testApp {
    public static void main(String[] args) throws IOException {

        gradeCalc myObj1 = new gradeCalc("data1.txt");
        System.out.println(myObj1.getAverageGrade());
        System.out.println(myObj1.getHigh());
        System.out.println(myObj1.getLow());
        System.out.println(myObj1.AllLetterGrades());

        System.out.println("");

        gradeCalc myObj2 = new gradeCalc("data2.txt");
        System.out.println(myObj2.getAverageGrade());
        System.out.println(myObj2.getHigh());
        System.out.println(myObj2.getLow());
        System.out.println(myObj2.AllLetterGrades());
    }
}

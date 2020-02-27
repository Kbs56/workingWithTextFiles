import java.io.IOException;
import java.util.Arrays;

public class testApp {
    public static void main(String[] args) throws IOException {

        gradeCalc myObj1 = new gradeCalc("data1.txt");
        System.out.println("Average of all grades found in file: " + myObj1.getAverageGrade());
        System.out.println("Highest grade found in file: " + myObj1.getHigh());
        System.out.println("Lowest grade found in file: " + myObj1.getLow());
        System.out.println("All letter grades: " + myObj1.AllLetterGrades());

        System.out.println("");

        gradeCalc myObj2 = new gradeCalc("data2.txt");
        System.out.println("Average of all grades found in file: " + myObj2.getAverageGrade());
        System.out.println("Highest grade found in file: " + myObj2.getHigh());
        System.out.println("Lowest grade found in file: " + myObj2.getLow());
        System.out.println("All letter grades: " + myObj2.AllLetterGrades());
    }
}

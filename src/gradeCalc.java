import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
public class gradeCalc {

    private ArrayList<Integer> list;

    public gradeCalc(String file) throws FileNotFoundException {
        Scanner inputScan = new Scanner(new File(file));
        list = new ArrayList<Integer>();

        while (inputScan.hasNextLine()) {
            String grade = inputScan.nextLine();
            try {
                list.add(Integer.parseInt(grade));
            } catch (NumberFormatException e) {
                System.out.println("Non number was found: " + grade);
            }
        }
        inputScan.close();
    }

    public String getAverageGrade() {
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        return "Average of all valid grades in file: " + total / list.size();
    }

    public String getHigh() {
        int high = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > high) {
                high = list.get(i);
            }
        }
        return "Highest Grade in file: " + high;
    }

    public String getLow() {
        int low = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < low) {
                low = list.get(i);
            }
        }
        return "Lowest Grade in file: " + low;
    }

    private String getGrade(int grade) {
        if (grade >= 90) {
            return "A";
        } else if (grade >= 80) {
            return "B";
        } else if (grade >= 70) {
            return "C";
        } else if (grade >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public String AllLetterGrades() throws FileNotFoundException {
        String[] letterGrades = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            letterGrades[i] = getGrade(list.get(i));
        }
        return Arrays.toString(letterGrades);
    }
}


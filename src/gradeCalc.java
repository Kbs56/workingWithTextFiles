import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
public class gradeCalc {

    // Creating array List to hold grades
    // making ArrayList private from user
    private ArrayList<Integer> list = new ArrayList<Integer>();

    // Constructor that accepts file as input
    public gradeCalc(String file) throws FileNotFoundException {
        // Creating Scanner Object to read through file
        // Scanner accepts the file name as input using the File() object
        Scanner inputScan = new Scanner(new File(file));

        // While loop with try catch
        while (inputScan.hasNextLine()) {
            String grade = inputScan.nextLine();
            try {
                // Using the parseInt method to make sure the value in the line is a number
                list.add(Integer.parseInt(grade));
            } catch (NumberFormatException e) {
                System.out.println("Non number was found: " + grade);
            }
        }
        inputScan.close();
    }

    // method to get average grade
    public Double getAverageGrade() {
        double total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        return total / list.size();
    }

    // method to get highest grade in file
    public int getHigh() {
        int high = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > high) {
                high = list.get(i);
            }
        }
        return high;
    }

    // method to get lowest grade in file
    public int getLow() {
        int low = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < low) {
                low = list.get(i);
            }
        }
        return low;
    }

    // Helper method for the AllLetterGrades() method
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

    // Method to display the letter grades based off of the grades in the file
    public String AllLetterGrades() {
        String[] letterGrades = new String[list.size()];
        // iterating through array list
        for (int i = 0; i < list.size(); i++) {
            // Loading array, assigning the index of the array to what the getGrade() class returns
            // passing in the index of the array list into the getGrade() method
            letterGrades[i] = getGrade(list.get(i));
        }
        // Using the Arrays.toString method to print the array as a string
        return Arrays.toString(letterGrades);
    }
}
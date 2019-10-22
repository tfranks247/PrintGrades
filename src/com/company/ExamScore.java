package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;


public class ExamScore {

    public static void main(String[] args) {
        {
            int  score;    // To hold a test score
            String grade;    // To hold a letter grade
            grade = "";
            // Create a Scanner object to read input.
            Scanner console = new Scanner(System.in);

            do {
                // Get the test score.
                System.out.print("Enter your numeric test score : ");
                score = console.nextInt();

                // Calculate the grade.
                if (score >= 97) {
                    grade = "A+";
                } else if (score >= 94) {
                    grade = "A";
                } else if (score >= 90) {
                    grade = "A";
                } else if (score >= 87) {
                    grade = "B+";
                } else if (score >= 84) {
                    grade = "B";
                } else if (score >= 80) {
                    grade = "B-";
                } else if (score >= 77) {
                    grade = "C+";
                } else if (score >= 74) {
                    grade = "C";
                } else if (score >= 70) {
                    grade = "C-";
                } else if (score >= 60) {
                    grade = "D";
                } else if (score >=59){
                    grade = "stop";
                }



                // Display the grade.
                System.out.println("Good job. Your grade is " + grade);
                System.out.println("Do you want to enter another score (Y/N)?");
                grade = console.next();
            } while (grade.equalsIgnoreCase("Y"));
        }
    }
}

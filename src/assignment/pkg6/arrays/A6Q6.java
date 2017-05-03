/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg6.arrays;

import java.util.Scanner;

/**
 *
 * @author ratid6445
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create a holding variable
        double replace;

        // create a system for user input
        Scanner input = new Scanner(System.in);

        //ask the user for the class size
        System.out.println("Enter the class size below: ");
        // allow user to input variable
        int numberStudents = input.nextInt();

        // create a double that holds the amount of values for the amount of students present
        double marks[] = new double[numberStudents];

        // ask the user to input all the marks
        System.out.println("Enter the marks of each student in the class below: ");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextDouble();
        }

        // put all the numbers in ascending order and get the values at 0 and the highest to find max and min
        for (int i = 0; i < numberStudents - 1; i++) {
            for (int j = i + 1; j < numberStudents; j++) {
                //replace the numbers greater than the number before
                if (marks[i] > marks[j]) {
                    replace = marks[i];
                    marks[i] = marks[j];
                    marks[j] = replace;
                }
            }
        }
        // array that gets the position of the highest number once sorted in ascending order
        double maxValue = marks[numberStudents - 1];
        // output the highest mark
        System.out.println("The highest mark in the class is: " + maxValue);
        //output the lowest number once sorted
        System.out.println("The lowest mark in the class is: " + marks[0]);

        //compute the average mark for the class that has been entered
        //start with an accumulator
        double sum = 0;
        //for loop to go through each number
        for (int i = 0; i < marks.length; i++) {
            //add all the numbers together to the sum
            sum = sum + marks[i];
        }
        // calculate the average
        double average = sum / numberStudents;
        System.out.println("The average mark for the class is: " + average);
    }
}

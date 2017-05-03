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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a scanner for the user input
        Scanner input = new Scanner(System.in);
        // get the number of students in the class
        System.out.println("How many students are in the class?");
        int numberStudents = input.nextInt();
        // get all the marks for each student
        System.out.println("Enter the marks of each student in the class");
        //create a list of numbers for the amount of students in the class
        double[] marks = new double[numberStudents];

        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextDouble();
        }
        //start with an accumulator
        double sum = 0;
        //for loop to go through each number
        for (int i = 0; i < marks.length; i++) {
            //add all the numbers together to the sum
            sum = sum + marks[i];
        }
        // calculate the average
        double average = sum / numberStudents;

        // calculate average to the nearest hundredth
        average = Math.round(average * 100) / 100.0;

        //tell the user the class average
        System.out.println("The class average is " + average + "%");
    }
}

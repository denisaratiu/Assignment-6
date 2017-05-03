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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a scanner for the user input
        Scanner input = new Scanner(System.in);
        // get the number of people in the group that are being surveyed
        System.out.println("How many individuals are in the group?");
        int numberIndividuals = input.nextInt();
        // get all the heights for each individual
        System.out.println("Enter the heights, in inches, of each individual in the group");
        //create a list of numbers for the amount of students in the class
        double[] heights = new double[numberIndividuals];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
        }
        //start with an accumulator
        double sum = 0;
        //for loop to go through each number
        for (int i = 0; i < heights.length; i++) {
            //add all the numbers together to the sum
            sum = sum + heights[i];
        }
        // calculate the average
        double average = sum / numberIndividuals;
        //tell the user the height average
        System.out.println("The average height of the individuals in the group is " + average + " inches");
        System.out.println("Height(s) above average: ");
        //output the individuals heights above the average height
        for (int i = 0; i < heights.length; i++) {
            if (average < heights[i]) {
                System.out.println(heights[i]);
            }
        }
    }
}

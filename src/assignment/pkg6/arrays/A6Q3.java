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
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner for user input
        Scanner input = new Scanner(System.in);
        //make an array that stores a switched value
        double replace;
        //make an array that holds two integers
        double array[] = new double[2];
        //ask user to input two numbers
        System.out.println("Enter 2 integers");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }
        //replace the value at spot 0 with value at 1 if the value at 0 is more than the value at 1
        if (array[0] > array[1]) {
            replace = array[0];
            array[0] = array[1];
            array[1] = replace;
        }
        System.out.println("The integers in ascending order are: ");
        System.out.println(array[0]);
        System.out.println(array[1]);
    }
}

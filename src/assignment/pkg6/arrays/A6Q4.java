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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a holding variable
        double replace;
        // make an array that holds 10 numbers
        double array[] = new double[10];

        //create a scanner to get user input 
        Scanner input = new Scanner(System.in);

        // allow individuals to input their numbers
        System.out.println("Enter 10 integers ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }
        //output numbers in ascending order
        System.out.println("Your numbers in ascending order are: ");

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                //replace the numbers greater than the number before
                if (array[i] > array[j]) {
                    replace = array[i];
                    array[i] = array[j];
                    array[j] = replace;
                }
            }
        }
        //output the numbers in ascending order
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);

        }
    }
}

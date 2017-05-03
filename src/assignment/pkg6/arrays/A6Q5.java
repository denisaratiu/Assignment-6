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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a holding variable
        double replace;

        //create a scanner to get user input 
        Scanner input = new Scanner(System.in);

        // allow individuals to input their numbers
        System.out.println("Enter the number of integers you want to sort: ");
        int numberIntegers = input.nextInt();

        // make an array that holds the amount of numbers the person will input
        double array[] = new double[numberIntegers];

        // input the integers
        System.out.println("Enter all the integers below: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }
        //output numbers in ascending order
        System.out.println("Your numbers in ascending order are: ");

        for (int i = 0; i < numberIntegers - 1; i++) {
            for (int j = i + 1; j < numberIntegers; j++) {
                //replace the numbers greater than the number before
                if (array[i] > array[j]) {
                    replace = array[i];
                    array[i] = array[j];
                    array[j] = replace;
                }
            }
        }
        //output the numbers in ascending order
        for (int i = 0; i < numberIntegers; i++) {
            System.out.println(array[i]);
        }
        System.out.println("The median mark in the array is: ");
        int middle = array.length / 2;
        // creat a varibale
        double median = 0;
        if (array.length % 2 == 1) {
            //desplay the number at the middle if there are odd amount of numbers
            median = array[middle];
        } else {
            //if there are even amount of numbers
            median = (array[middle - 1] + array[middle]) / 2;
        }
        System.out.println(median);
    }
}

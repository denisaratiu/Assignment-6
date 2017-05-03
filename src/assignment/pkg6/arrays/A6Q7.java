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
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an array that holds the number of values
        int[] primeNumbers = new int[1000];

        for (int i = 0; i < primeNumbers.length; i++) {
            primeNumbers[i] = i;
        }
        //create an integer to make consectutive integers
        for (int n = 2; n < 31; n++) {

            //start at 2 and go up until 1000
            for (int p = 2; p < primeNumbers.length; p++) {
                //multiply both integers together to find prime numbers
                int isPrime = p * n;
                // if it is prime and under 1000 it is part of the primeNumbers
                if (isPrime < 1000) {

                    primeNumbers[isPrime] = 0;

                }
            }
        }
        //output prime numbers between 2 and 1000
        for (int i = 2; i < primeNumbers.length; i++) {
            if (primeNumbers[i] != 0) {
                //output the prime numbers
                System.out.println(primeNumbers[i]);
            }
        }

    }
}

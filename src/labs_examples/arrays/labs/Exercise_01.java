package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */
public class Exercise_01 {


    public static void main(String[] args) {

        int sum = 0;
        int x = 10;

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];

        for(int i = 0; i < array.length; i++) {
            System.out.println("Enter " + x + " numbers");
            x--;
            array[i] = scanner.nextInt();
            sum+= array[i];
        }

        double average = sum / 10;

        System.out.println("Sum is : " + sum);
        System.out.println("Average is " + average);

    }

}
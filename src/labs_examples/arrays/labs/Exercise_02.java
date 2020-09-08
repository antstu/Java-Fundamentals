package labs_examples.arrays.labs;
import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        Boolean bool = false;

        // write code here
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for(int i = 0; i < 9; i++) {
            if (array[i] == number) {
                bool = true;
                System.out.println("Number is in the array");
            }
            else {
                continue;
            }
        }

        if(!bool) {
            System.out.println("Number is not in the array");
        }






    }
}
package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {
        int[][] twoD = new int[4][4];

        for (int i = 0; i < twoD.length; i++){
            for (int j = 0; j < twoD[i].length; j++) {
                twoD[i][j] = i + j;
                System.out.print(twoD[i][j] + " - ");
            }
            System.out.println();
        }
    }
}

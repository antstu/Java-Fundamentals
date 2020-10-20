package labs_examples.generics.labs;

import java.util.ArrayList;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList
 */



class Main2 {

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList();

        array.add(1);
        array.add(2);
        array.add(3);

        double total = Generic2.sum(array);

        System.out.println(total);

    }

}


class Generic2 {

    public static <N extends Number> double sum(ArrayList<N> arr) {
        double sum = 0;

        for(N number :arr) {
            sum += number.doubleValue();
        }
        return sum;
    }
}
package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

class TryCatchExample {

    public static void main(String[] args) {

        int[] numbers = {1,2,3};

        try {

            int x = numbers[0] + numbers[5];

        } catch (ArrayIndexOutOfBoundsException exc) {

            System.out.println(exc.getMessage());

        }

        System.out.println("completed");

    }
}


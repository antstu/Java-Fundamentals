package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */


class TryCatchMultipleExample {

    public static void main(String[] args) {

        int[] numbers = {1,2,3};

        try {

//            int x = numbers[0] + numbers[5];
            int x = numbers[0] / 0;

        } catch (ArrayIndexOutOfBoundsException exc) {

            System.out.println(exc.getMessage());

        } catch (Exception exc) {
            System.out.println("There was an unexpected error");
            System.out.println(exc.getMessage());

        }

        System.out.println("completed");

    }
}


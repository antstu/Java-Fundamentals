package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */


class TryCatchNestedxample {

    public static void main(String[] args) {

        int[] numbers = {1,2,3};

        try {
            System.out.println("starting connection");
            int x = numbers[0] + numbers[5];
//            int x = numbers[0] / 0;

        } catch (ArrayIndexOutOfBoundsException exc) {
            try {
                int x = numbers[0] + numbers[5];
                System.out.println("please doublke check length of array");
            } catch (Exception nestexc) {
                System.out.println(nestexc.getMessage());
            }

            System.out.println(exc.getMessage());

        } catch (Exception exc) {
            System.out.println("There was an unexpected error");
            System.out.println(exc.getMessage());

        } finally {
            System.out.println("close connection");
        }



    }
}
package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */


class ThrowExceptionExample {

    public static void main(String[] args){
        try {

            int y = divide(1, 0);
        } catch(ArithmeticException exc){
            System.out.println("AtrithmrticException");
        }
    }


    public static int divide(int a, int b) throws ArithmeticException {
        return a/b;
    }

}




package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */


class ThrowExceptionMethodExample {

    public static void main(String[] args){
        try {

            int y = startDivide(1, 0);
        } catch(ArithmeticException exc){
            System.out.println("ArithmrticException");
        }
    }

    public static int startDivide(int a, int b) throws ArithmeticException {

        int x = divide(a,b);

        return x;
    }


    public static int divide(int a, int b) throws ArithmeticException {
        return a/b;
    }

}

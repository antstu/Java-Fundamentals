package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */



class TestException extends Exception {

    @Override
    public String toString() {
        return "you cant be less than 0 years old";
    }
}


class CustomExample {

    public static void main(String[] args) {
        System.out.println("How old are you?");

        int x = -22;


        try {
            checkAge(x);
        } catch (TestException exc){

            System.out.println(exc.toString());

        }
    }



        public static void checkAge(int x) throws TestException {
            if (x > 0) {
                System.out.println("Age is valid");
            } else {
                throw new TestException();
            }
        }
}
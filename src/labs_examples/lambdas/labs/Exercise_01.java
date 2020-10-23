package labs_examples.lambdas.labs;

/**
 * Lambdas Exercise 1:
 *
 *      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 *      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 *
 *
 *
 *
 */


//TODO:anonymous inner class?

//1

@FunctionalInterface
interface TestFunctionalInterface {

    void testing();
}




//3

@FunctionalInterface
interface TestFunctionalParam {

    int timestwo(int a);
}

@FunctionalInterface
interface TestFunctionalParam2 {

    String returnCombined(String a, String b);

}









class Testing {

    public static void main(String[] args) {

        //2
        TestFunctionalInterface test = () -> {
            System.out.println("hello");
        };

        test.testing();

        // 4
        TestFunctionalParam test2 = (int a) -> a * 2;

        int a = test2.timestwo(5);

        System.out.println(a);

        //6
        TestFunctionalParam2 test3 = (String c, String d) ->  c + d;

        String e = test3.returnCombined("Hello,", "GoodBye");

        System.out.println(e);

        test3 = (String c, String d) -> c + " " + d;

        System.out.println(test3.returnCombined("Hello", "World"));


        TestFunctionalParam2 obj = new TestFunctionalParam2() {
            @Override
            public String returnCombined(String a, String b) {
                return a + b;
            }
        };


        String hello = obj.returnCombined("Hello", "World");
        System.out.println(hello);





    }
}


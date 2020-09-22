package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()

        int y = multiply(3,5);
        System.out.println(y);


        double x = divide(10,2);
        System.out.println(x);

        printJoke();

        int seconds = yearsToSec(5);
        System.out.println(seconds);

        printArgLength("Hello", "my", "name", "is");

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b

    private static int multiply(int a, int b) {

        return a * b;

    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b

    private static double divide( int a, int b ) {

        return a / b;

    }


    // 3) Create a static void method that will print of joke of your choice to the console

    private static void printJoke() {

        System.out.println("Knock Knock");

    }


    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents

    private static int yearsToSec(int years) {

        return years * 31_536_000;

    }


    // 5) Create a varargs method that will return the length of the varargs array passed in

    private static void printArgLength(String... args) {

        System.out.println(args.length);


    }






}

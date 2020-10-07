package labs_examples.packages.labs;

import labs_examples.packages.testing.Testing;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Packages Exercise 1: Protected modifier
 *
 *      1) Within this package, create two new labs_examples.packages.
 *      2) Create a new Java class in each package.
 *      3) Create at least two methods in each class, with at least one with the protected access modifier
 *      4) Demonstrate how the the protected access modifier restricts access from package to package
 *
 */

class Test {

    public static void main(String[] args) {

        Testing.goodyBye();
        double x = Math.PI;

        Date d = new Date();

        System.out.println(d);
        SimpleDateFormat sdf = new SimpleDateFormat("MMM/dd/yyyy");
        String s = sdf.format(d);
        System.out.println(s);

        long time = System.currentTimeMillis();

        System.out.println(time);

    }
}

class Test2 extends Testing {

    public static void main(String[] args) {
//        sub class of testing so hello() shows up
        Testing.hello();
    }
}

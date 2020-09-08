package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        calcVolArea(3.14, 5);

    }


    public static void calcVolArea(double radius, double height) {

        double volume = 3.14 * Math.pow(radius,2) * height;
        double surArea = 2 * Math.PI * Math.pow(radius,2) + (2 * Math.PI * radius * height);



        System.out.println(volume);
        System.out.println(surArea);


    }
}
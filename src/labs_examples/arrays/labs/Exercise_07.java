package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Anthony");
        names.add("Bob");
        names.add("Tony");
        names.add("Jack");

        System.out.println("There are " + names.size() + " people in the list");

        Boolean isEmpty = names.isEmpty();

        if(isEmpty) {
            System.out.println("List is empty");
        }
        else {
            System.out.println("List is not empty");
        }

        names.contains("Anthony");

        System.out.println("the first person in the list is " + names.get(0));



    }







}

package labs_examples.datastructures.linkedlist.labs;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *      LinkedLists - Exercise_01
 *
 *      Demonstrate your mastery of Java's built-in LinkedList class by demonstrating the following:
 *
 *      1) create a LinkedList (from Java's libraries)
 *      2) add()
 *      3) addAll()
 *      4) addFirst()
 *      5) addLast()
 *      6) getFirst()
 *      7) getLast()
 *      8) get()
 *      9) set()
 *      10) push()
 *      11) pop()
 *      12) remove()
 *      13) contains()
 *      14) listIterator()
 *      15) clear()
 */


public class Exercise_01 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        ArrayList<String> strings = new ArrayList<>();

        strings.add("Hello");
        strings.add("my");
        strings.add("name");
        strings.add("is");

        list.add("anthony");
        list.addAll(strings);
        list.addFirst("Howdy");
        list.addLast("Goodbye");
        list.getFirst();
        list.getLast();
        list.get(0);
        list.set(0,"howdy");
        list.push("howdy");
        list.pop();
        list.remove();
        list.contains("anthony");
        list.listIterator();
        list.clear();

    }
}

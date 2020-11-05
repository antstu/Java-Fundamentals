package labs_examples.datastructures.hashmap.labs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *  HashMaps Exercise_01
 *
 *  Demonstrate you're mastery of using Java's built-in HashMap class below.
 *
 *  Using a HashMap demonstrate the use of the following methods:
 *
 *  put()
 *  get()
 *  putAll()
 *  size()
 *  contains()
 *  keySet()
 *  entrySet()
 *  putIfAbsent()
 *  remove()
 *  replace()
 *  forEach()
 *  clear()
 *
 */

public class Exercise_01 {

    public static void main(String[] args){

        HashMap<String, Person> peopleMap = new HashMap();


        // create a few Person objects
        Person anthony = new Person("Anthony", "Stuvecke", "anthony@gmail.com");
        Person phil = new Person("Phil", "Stuvecke", "phil@gmail.com");
        Person tom = new Person("Tom", "Stuvecke", "tom@gmai.com");
        Person bob = new Person("Bob", "Stuvecke", "bob@gmail.com");


        // "put" the Person objects into the HashMap
        peopleMap.put(ryan.getEmail(), ryan);
        peopleMap.put(kim.getEmail(), kim);
        peopleMap.put(martin.getEmail(), martin);
        peopleMap.put(caden.getEmail(), caden);


        // demonstrate "getting" an element out of the HashMap
        Person example = peopleMap.get("caden@codingnomads.co");
        System.out.println(example.toString());


        // demonstrate iterating through the entries of a HashMap
        Set entries = peopleMap.entrySet();
        Iterator iterator = entries.iterator();
        // loop through the entries
        while(iterator.hasNext()) {
            // get each Entry individually
            Map.Entry person = (Map.Entry)iterator.next();
            // print out the entry's key and value
            System.out.print("The key is: "+ person.getKey()
                    + " and the value is: " + person.getValue().toString());
        }
    }

}

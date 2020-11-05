package labs_examples.datastructures.hashmap.labs;

import java.util.HashMap;

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

        Person anthony = new Person("Anthony", "Stuvecke", "anthony@gmail.com");
        Person phil = new Person("Phil", "Stuvecke", "phil@gmail.com");
        Person tom = new Person("Tom", "Stuvecke", "tom@gmail.com");
        Person bob = new Person("Bob", "Stuvecke", "bob@gmail.com");

        peopleMap.put(anthony.getEmail(), anthony);
        peopleMap.put(phil.getEmail(), phil);
        peopleMap.put(tom.getEmail(), tom);
        peopleMap.put(bob.getEmail(), bob);


        // How to handle the nullpointerexception??
        Person test = peopleMap.get("anthony@gmail.com");
        System.out.println(test.toString());

        System.out.println("The size of the map is " + peopleMap.size());

        System.out.println("Is 'anthony@gmail.com' in the hashmap? " + peopleMap.containsKey("anthony@gmail.com"));

        System.out.println("key set : " + peopleMap.keySet());

        System.out.println("Entry set : " + peopleMap.entrySet());

        Person tommy = new Person("Tommy", "Stuvecke", "tommy@gmail.com");
        peopleMap.putIfAbsent(tommy.getEmail(), tommy);

        //create a new hasmap and copy everything over
        HashMap<String, Person> peopleMapCopy = new HashMap();
        peopleMapCopy.putAll(peopleMap);

        peopleMap.remove("tommy@gmail.com");
        peopleMap.replace("tom@gmail.com", tommy);

        peopleMap.forEach((k,v)-> {
            System.out.printf("key: " + k + " value: " + v);
        });

        peopleMap.clear();


    }

}

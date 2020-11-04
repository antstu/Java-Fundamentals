package labs_examples.datastructures.queue.labs;

import java.util.PriorityQueue;

/**
 *      Demonstrate your mastery of Java's (sun's) built-in Queue class (as seen in the import statement
 *      above) by completing the following:
 *
 *      1) instantiate a new Queue
 *      2) demonstrate the use of EVERY method in the Queue class - there are 7
 */



class JavaQueue {


    public static void main(String[] args) {

        PriorityQueue<String> myQueue = new PriorityQueue();


        myQueue.add("Anthony");
        myQueue.add("was");
        myQueue.add("here");

        System.out.println(myQueue.peek());

        boolean hasJava = myQueue.contains("Queue");
        System.out.println("Does the queue contain \"Anthony\"? -> " + hasJava);


        String r1 = myQueue.remove();
        System.out.println(r1);


        String e1 = myQueue.element();
        System.out.println(e1);


        myQueue.clear();


        // what is the last one missing?
    }
}

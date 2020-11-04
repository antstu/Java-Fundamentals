package labs_examples.datastructures.stack.labs;

import java.util.Stack;

/**
 *      Demonstrate your mastery of Java's built-in Stack class by completing the following:
 *
 *      1) instantiate a new Stack
 *      2) demonstrate the use of EVERY method in the Stack class - there are 5
 */


public class Exercise_01 {
    public static void main(String[] args){
        Stack<String> myStack = new Stack();
//      1
        if (myStack.empty()){
            System.out.println("the stack is empty");
        }

//      2
        myStack.push("Hi");
        myStack.push("Anthony");
//      3
        System.out.println("Size of the Stack after pushing: " + myStack.size() + "\n");

//      4
        System.out.println("Peek: " + myStack.peek() + "\n");

        System.out.println("Depth of \"Anthony\": " + myStack.search("Anthony")  + "\n");

//      5
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        System.out.println("\nSize of the Stack after popping: " + myStack.size());

    }
}
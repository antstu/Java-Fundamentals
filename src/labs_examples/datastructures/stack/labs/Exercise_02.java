package labs_examples.datastructures.stack.labs;


import java.util.Arrays;

/**
 *      Queues - Exercise_02
 *
 *      Write a new custom (Generic) Stack class that uses a traditional Array as the underlying data structure
 *      rather than the LinkedList as in the example we have already seen.
 *
 *      Your custom Stack class must also do the following:
 *
 *      1) throw a custom exception when trying to pop an element from an empty Stack
 *      2) resize the Queue (the underlying array) to be twice the size when the Stack is more than 3/4 full
 *      3) resize the Queue (the underlying array) to be half the size when the Stack is more than 1/4 empty
 *      4) contain the methods peekFirst() and peekLast()
 *      5) contain a size() method
 *      6) contain a method to print out the data of all elements in the Stack
 *
 */

class TestException extends Exception {

    @Override
    public String toString() {
        return "list is empty";
    }
}



class Stack {

    String data[] = new String[10];


    public static void main(String[] args) throws TestException {


        Stack stack = new Stack();

        stack.push("Anthony");
        stack.push("Was");
        stack.push("here");
        stack.push("y'all");

        stack.printAll();

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.printAll();


    }

    public String pop() throws TestException{

        // throw a custom exception when trying to pop an element from an empty Stack
        if (data.length == 0) {
        } else {
            throw new TestException();
        }

        //FILO
        int size = size();
        String string = data[--size];
        data[size] = null;

        return string;

    }


    public void push(String str) {

        int size = checkLength();
        data[size] = str;

    }

    private int checkLength() {

        int newSize = data.length;

        if (size()/ data.length > 0.75 ) {

            newSize = data.length * 2;
            data = Arrays.copyOf(data, newSize);

        } else if(size()/ data.length < 0.25 ) {

            newSize = data.length / 2;
            data = Arrays.copyOf(data, newSize);
        }
        return newSize;
    }


    private int size() {

        return data.length;
    }

    private void printAll(){
        for(int i=0; i < size(); i++) {
            System.out.println(data[i]);
        }
    }
}

package labs_examples.datastructures.linkedlist.labs;

/**
 *      LinkedLists - Exercise_02
 *
 *      Write your own custom LinkedList class. Although it can mimic the CustomLinkedList
 *      class we used here, it must be entirely unique. Please also add at least two
 *      additional helper methods that you think could be useful. Refer to Java's built-in
 *      LinkedList class for inspiration. Your new LinkedList class should ONLY allow users
 *      to add and remove elements from the front of the list AND the end of the list.
 *      Also, instead of using the index in the get() and remove() methods, these methods should
 *      get() and remove() based by the Node's value, not it's index.
 */






public class Exercise_02<T> {
    private Node head;

    public Exercise_02(T data) {

        if (data == null) {
            head = null;
        } else {
            addToEnd(data);
        }
    }

    public void addToEnd(T data) {
        insert(data,0);
    }

    public void addToFront(T data) {
        insert(data,  1);
    }



    public void insert(T data, int toFront) {


        if (toFront == 1) {
            if (head == null) {
                head = new Node(data);
            } else {
                head = new Node(data, head);
            }

        } else {

            if (head == null) {
                head = new Node(data);
            } else {

                Node iterator = head;

                    while (iterator.next != null) {
                        iterator = iterator.next;
                    }

                    iterator.next = new Node(data);
                }

        }


    }
    public void remove(int removeFromFront) {
        if (removeFromFront == 1) {
            head = head.next;

        } else {
            Node iterator = head;

            while (iterator.next != null) {
                iterator = iterator.next;
            }
            iterator.next = null;


        }
    }

    public int size() {
        int count = 0;
        Node iterator = head;

        while (iterator != null) {
            count++;
            iterator = iterator.next;
        }

        return count;
    }

}
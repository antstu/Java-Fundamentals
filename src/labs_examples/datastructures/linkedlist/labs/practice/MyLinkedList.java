package labs_examples.datastructures.linkedlist.labs.practice;

import labs_examples.datastructures.linkedlist.labs.Node;

public class MyLinkedList<T> {

    Node<T> head;
    int itemCount = 0;

    public void add(T data) {

        if (head == null) {
            head = new Node(data);
        } else {

            Node<T> iter = head;

            while (iter.next != null) {
                iter = iter.next;
            }
            iter.next = new Node(data);
        }
        itemCount++;
    }

    public void addToFront(T data) {

        if (head == null) {
            head = new Node(data);
        } else {

            head = new Node(data,head);

        }
        itemCount++;
    }

    public int length() {
        return itemCount;
    }

    public T getFromIndex(int index) {

        if (head == null) {
            return null;
        } else if (index > itemCount) {
            //would usually throw an exception
            return null;
        }

        Node<T> iter = head;

        for (int i = 0; i < index; i++) {
            iter = iter.next;
        }

        return iter.data;

    }

    public void remove(int index) {

        if (head == null) {
            return;
        } else if (index > itemCount) {
            //would usually throw an exception
            return;
        }

        Node<T> iter = head;

        if (index == 0) {
            head = head.next;
            itemCount--;
            return;
        } else if(index == itemCount){

            while (iter.next.next != null) {
                iter = iter.next;
            }
            iter.next = null;
            itemCount--;

        } else {

            for (int i = 0; i < index - 1; i++) {
                iter = iter.next;
            }

            iter.next = iter.next.next;
            itemCount--;

        }

    }

    public void print () {
        Node<T> iter = head;

        while(iter != null) {
            System.out.println(iter.data.toString());
            iter = iter.next;
        }

    }

    public boolean contains(T val) {
        if(head == null) {
            return false;
        } else {
            Node<T> iter = head;

            do{
                if (iter.data.equals(val)) {
                    return true;
                }
                iter = iter.next;
            } while(iter != null);
        }
        return false;
    }
}


class Demo{

    public static void main(String[] args) {
        MyLinkedList<String> mll = new MyLinkedList<>();

        mll.add("Anthony");
        mll.add("Bob");
        mll.addToFront("Tony");
        mll.print();

        mll.add("Jess");
        mll.add("Ryan");
        System.out.println(mll.getFromIndex(2));
        System.out.println();
        mll.print();
        mll.remove(1);
        System.out.println();
        mll.print();
        mll.remove(0);
        System.out.println();
        mll.print();
        mll.remove(mll.length()-1);
        System.out.println();
        mll.print();

        System.out.println(mll.contains("Bob"));
        System.out.println(mll.contains("Bobbby"));

    }
}


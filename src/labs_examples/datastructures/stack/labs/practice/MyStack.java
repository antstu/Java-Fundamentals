package labs_examples.datastructures.stack.labs.practice;

public class MyStack<T> {

    private T[] data;
    private int lastIndex = 0;
    private boolean isEmpty = true;

    public MyStack() {
         data = (T[]) new Object[10];
    }

    public void add(T val) {
        if(isEmpty) {
            data[0] = val;
        } else {
            data[++lastIndex] = val;
        }
        isEmpty = false;
    }

    public void remove() {
        if(isEmpty) {
            return;
        } else {
            data[lastIndex] = null;
            lastIndex--;
        }
    }

    public T get() {
        if(isEmpty) {
            return null;
        } else {
            return data[lastIndex];
        }
    }

    public void print() {
        for(int i = 0; i <= lastIndex; i++) {
            System.out.println(data[i]);
        }
    }
}

class Demo {
    public static void main(String[] args) {
        MyStack<String> test = new MyStack();

        test.add("Anthony");
        test.add("Phil");
        test.add("Tony");
        test.add("Sal");

        test.print();

        System.out.println(test.get());
        test.remove();
        System.out.println(test.get());

    }
}

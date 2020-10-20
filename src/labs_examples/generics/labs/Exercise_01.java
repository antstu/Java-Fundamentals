package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */



class Main {
    public static void main(String[] args) {

        Generic uno = new Generic<String, Integer>("Hello", 100);

        Generic dos = new Generic<String, Double>("Bye", 100.21);

        String s1 = uno.getOne().toString();
        uno.getTwo();

        String s2 = dos.getOne().toString();
        dos.getTwo();

        System.out.println(s1);

        System.out.println(s2);



    }
}



class Generic<T, U> {

    T one;
    U two;

    public Generic(T one, U two) {
        this.one = one;
        this.two = two;
    }

    public T getOne() {
        return one;
    }

    public void setOne(T one) {
        this.one = one;
    }

    public U getTwo() {
        return two;
    }

    public void setTwo(U two) {
        this.two = two;
    }
}
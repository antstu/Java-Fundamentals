package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */


class ExampleController {
    public static void main(String args[]) {
        System.out.println("Starting Main thread");
        ExampleThread thread1 = new ExampleThread("One");
        ExampleThread thread2 = new ExampleThread("Two");
        ExampleThread thread3 = new ExampleThread("Three");
        System.out.println("Finishing main Thread");
    }
}
class ExampleThread extends Thread {
    ExampleThread(String name) {
        super(name);
        start();
    }
    @Override
    public void run() {
        System.out.println(getName() + " starting.");
        try {
            for(int count=0; count < 5; count++) {
                Thread.sleep(400);
                System.out.println("In " + getName() +
                        ", count is " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println("Error with: " + getName());
        }
        System.out.println("Ending " + getName());
    }
}
package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */

//TODO: why does thread 3 finish before the others? without priority

class Testing{
    public static void main(String[] args) {
        System.out.println("Starting Main Thread");

        RunnableTest runnable1 = new RunnableTest();
        Thread thread1 = new Thread(runnable1, "1");
        thread1.start();

        Thread thread2 = new Thread(new RunnableTest(), "2");
        thread2.start();
//        thread2.setPriority(1);

        new Thread(new RunnableTest(), "3").start();
        System.out.println("Ending Main Thread");
    }
}


class RunnableTest implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starting.");
        try {
            for(int count=0; count<10; count++) {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + ": " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(Thread.currentThread().getName() + " interrupted.");
        }
        System.out.println(Thread.currentThread().getName() + " terminating.");
    }
}



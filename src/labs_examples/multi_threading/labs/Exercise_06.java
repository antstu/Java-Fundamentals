package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 6:
 *
 *      Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 *      print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */

class StartThreads{
    public static void main(String[] args) {

        System.out.println("** Main Thread Start **");
        Counter count = new Counter();
        // TODO: better approach ?  -- number goes above 100
        while (Counter.number <100) {
            RunnableClass threadEins = new RunnableClass("Eins", count);
            RunnableClass threadZwei = new RunnableClass("Zwei", count);
            RunnableClass threadDrei = new RunnableClass("Drei", count);
        }
        System.out.println("** Main Thread End **");

    }

}


class RunnableClass implements Runnable {

    Thread thread;
    Counter counter;

    public RunnableClass(String name, Counter counter) {
        thread = new Thread(this, name);
        this.counter = counter;
        thread.start();

    }

    @Override
    public void run() {
        System.out.println("starting: " + thread.getName());
            synchronized(counter) {
                counter.counting();
            }
    }
}

class Counter {
    static int number = 0;
    public void counting() {
        System.out.println(number);
        number++;
    }
}
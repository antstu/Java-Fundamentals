package labs_examples.datastructures.queue.practice;

public class MyQueue<T> {

    private T[] arr = (T[]) new Object[10];
    private int newestIndex;
    private int oldestIndex;
    private boolean isEmpty;
    private int itemCount;


    public void add(T val) {
        if(isEmpty) {
            arr[0] = val;
            oldestIndex = 0;
            newestIndex = 0;
        } else {
            arr[oldestIndex] = val;
            oldestIndex++;
        }
        isEmpty = false;
        itemCount++;

        if(itemCount > arr.length) {
            resize();
        }
    }

    public void resize() {
        T[] old = arr;
        arr = (T[]) new Object[old.length*2];
        int index = 0;
        for(int i = oldestIndex; i <= newestIndex; i++){
            arr[index] = old[i];
            index++;
        }
        oldestIndex = 0;
        newestIndex = index;
    }

    public void remove() {
        if(isEmpty || itemCount == 0) {
            return;
        } else {
            arr[oldestIndex] = null;
            oldestIndex++;
        }
        itemCount--;
        if(oldestIndex > newestIndex){
            oldestIndex = 0;
            newestIndex = 0;
        }
    }

    public T get() {
        if(isEmpty || itemCount == 0) {
            return null;
        } else {
            return arr[oldestIndex];
        }
    }

}

// null null null null 5

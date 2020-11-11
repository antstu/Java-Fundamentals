package labs_examples.datastructures.hashmap.labs;

/**
 *      HashMaps Exercise_02
 *
 *      Rewrite the CustomHashMap class to meet the following requirements:
 *      1) no method has the same name as any in CustomHashMap
 *          (do not use refactor - do it manually)
 *      2) no variable has the same name as any in CustomHashMap
 *          (do not use refactor - do it manually)
 *      3) resize the HashMap when the underlying array is more than half full
 *      4) triple the size of the underlying array on resize()
 *      5) instead of checking the number of keys to resize, check the number of values
 *      6) on collisions, add new elements to the front of the LinkedList, not the end
 *      7) anytime someone tries to get/update/remove an element that does not exist, print
 *          out a message indicating that the element does not exist
 *      8) add at least one more method that you think could be useful to the HashMap
 *          review Java's built-in HashMap for inspiration
 */


/**
 * A Key-Value Pair
 */
class Entry<K, V> {
    private K key;
    private V value;
    // it means this is a LinkedList
    Entry next = null;

    Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}


public class Exercise_02<K,V> {

    private Entry<K, V>[] table = new Entry[10];

    private int getCode(K key) {
        int index = Math.abs(key.hashCode() % table.length);
        return index;
    }

    private void add(K key, V val) {

        int index = getCode(key);

        Entry<K,V> newEntry = new Entry(key, val);

        //no collision
        if (table[index] == null) {
            table[index] = newEntry;
        }
        //collison
        else {
            //first entry in index
            Entry<K,V> first = table[index];
        }




    }

    private void rescale() {
        //copy of existing
        Entry<K,V>[] old = table;
        //new entry
        table = new Entry[old.length * 3];

        for (int i = 0; i < old.length; i++) {
            try {
                // get the Entry at the index of "i" from the "old" table
                Entry entry = old[i];
                // call the put() method passing the key and value to add this element to the new table
                add((K) entry.getKey(), (V) entry.getValue());

                // check to see if this entry is actually the start of a linked list
                while (entry.next != null) {
                    // if it is, traverse to the next node
                    entry = entry.next;
                    // and call the put() method to add this element
                    add((K) entry.getKey(), (V) entry.getValue());
                    // loop
                }
            } catch (Exception e) {
                // do nothing - this is just to handle empty indexes
            }
        }
    }

}

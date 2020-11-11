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


import labs_examples.datastructures.linkedlist.examples.CustomLinkedList;

/**
 * A Key-Value Pair
 */
class Item<K, V> {
    private K name;
    private V content;
    // it means this is a LinkedList
    Item next = null;

    Item(K name, V content) {
        this.name = name;
        this.content = content;
    }

    public K getName() {
        return name;
    }

    public V getContent() {
        return content;
    }

    public void setContent(V content) {
        this.content = content;
    }
}


public class Exercise_02<K,V> {

    private Item<K, V>[] linkedList = new Item[10];

    private int getCode(K key) {
        int index = Math.abs(key.hashCode() % linkedList.length);
        return index;
    }

    public CustomLinkedList<V> values() {
        CustomLinkedList<V> values = new CustomLinkedList<>();

        for (int i = 0; i < linkedList.length; i++) {
            if (linkedList[i] != null) {
                Item<K, V> p = linkedList[i];
                while (p != null) {
                    // if it is, traverse the list and add all keys
                    values.add(p.getContent());
                    p = p.next;
                }

            }
        }

        return values;
    }

    private void add(K key, V val) {

        int index = getCode(key);

        Item<K, V> newItem = new Item(key, val);

        //no collision
        if (linkedList[index] == null) {
            linkedList[index] = newItem;
        }
        //collison
        else {
            //first entry in index
            Item<K, V> first = linkedList[index];
            // add to the front of the linked list, not the end
            linkedList[index] = newItem;
            newItem.next = first;

        }

        if (values().size() > linkedList.length * .5) {
            rescale();
        }




    }

    private void rescale() {
        //copy of existing
        Item<K,V>[] old = linkedList;
        //new entry
        linkedList = new Item[old.length * 3];


        for (int i = 0; i < old.length; i++) {
            try {
                Item item = old[i];
                add((K) item.getName(), (V) item.getContent());

                while (item.next != null) {
                    item = item.next;
                    add((K) item.getName(), (V) item.getContent());
                }
            } catch (Exception e) {
            }
        }
    }


    public V get(K key) {
        int index = getCode(key);

        if (linkedList[index] == null) {
            printNonExistant();
            return null;
        }

        Item<K, V> entry = linkedList[index];

        while (entry.getName() != key) {

            if (entry.next == null) {
                return null;
            }

            entry = entry.next;
        }
        return entry.getContent();
    }

    private void printNonExistant() {
        System.out.println("Element does not exist");
    }

}

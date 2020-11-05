package labs_examples.datastructures.linkedlist.labs;

public class Node<T> {

        public T data;
        public Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public Node(T data, Node node) {
            this.data = data;
            this.next = node;
        }
}

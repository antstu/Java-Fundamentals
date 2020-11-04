package labs_examples.datastructures.linkedlist.labs;

/**
 *      LinkedLists - Exercise_03
 *
 *      Please create your own custom doubly-LinkedList from start to finish :) You got this!
 */



class Exercise_03 {

    public Node head = null;
    public Node end = null;




    public void insert(String data){

        Node node = new Node(data);
        Node end = new Node(data);

        if(head == null) {
            head = node;
            node.next = head;
        }
        else {
            end.next = node;
            end = node;
            end.next = head;
        }
    }


}

class Testing {

    public static void main(String[] args) {
        Exercise_03 test = new Exercise_03();

        test.insert("Hello");
        test.insert("Goodbye");

    }
}




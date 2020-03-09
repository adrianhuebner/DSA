package stacksandqueues;

// thanks to the following website that talked through implementing a Node class: https://www.cs.colorado.edu/~main/edu/colorado/nodes/Node.java
public class Node <E> {

    E data;
    Node <E> next;

    Node(E data){
        this(data, null);
    }

    Node(E data, Node next){
        this.data = data;
        this.next = next;
    }
}

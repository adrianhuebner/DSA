package linkedlist;

// got the set up for this linked list from geeks for geeks

public class LinkedList{
    Node head;

    static class Node {
        int data;
        Node next;
        public Node(int data, linkedlist.LinkedList.Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void insert(int newValue){
        Node node = new Node();
        node.value = newValue
        if(head == null){
            head == node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public boolean includes(int searchValue){
        int currentSpot = this.head;
        while(currentSpot != null){
            if(currentSpot.data == searchValue){
                return true;
            } else{
                currentSpot = currentSpot.next;
            }
            return false;
        }
    }

    public String toString(){

    }
}
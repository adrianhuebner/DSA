package linkedlist;

import java.util.StringJoiner;

// got the set up for this linked list from geeks for geeks

public class LinkedList{
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int value){
            this(value, null);
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void insert(int newValue){
        Node node = new Node(newValue);
        node.data = newValue;
        if (head != null) {
            node.next = head;
        }
        head = node;
    }

    public boolean includes(int searchValue){
        Node currentSpot = this.head;
        while(currentSpot != null){
            if(currentSpot.data == searchValue){
                return true;
            } else{
                currentSpot = currentSpot.next;
            }
        }
        return false;
    }

    public String toString(){
        Node current = head;
        StringJoiner string = new StringJoiner(" ");
        string.add("String Linked List: ");

        while(current != null){
            string.add("" + current.data);
            current = current.next;
        }
        return string.toString();
    }

    public void append(int newValue){
        Node node = new Node(newValue);
        if(this.head == null){
            this.head = node;
        } else {
            Node endNode = this.head;
            while(endNode.next != null){
                endNode = endNode.next;
            }
            endNode.next = node;
        }
    }

    // thanks to geekviewpoint.com for an example of how to write this code that I was inspired by
    public void insertBefore(int value, int newValue){
        Node newNode = new Node(newValue);
        if(head.data == value){
            insert(newValue);
        } else{
            Node previous = head;
            Node current = head.next;
            while(current != null && current.data != value){
                previous = previous.next;
                current = current.next;
            }
            if(current == null){
                System.out.println("Original value is not in the linked list");
            } else {
                newNode.next = current;
                previous.next = newNode;
            }
        }
    }

    // thanks to geekviewpoint.com and geeksforgeeks.com for having code that I used as an inspiration
    public void insertAfter(int value, int newValue){
        Node newNode = new Node(newValue);
        Node current = head;
        while(current != null && current.data != value){
            current = current.next;
        }
        if(current == null){
            System.out.println("Original value is not in the linked list");
        } else {
            newNode.next = current.next;
            current.next = newNode;
        }
    }

}
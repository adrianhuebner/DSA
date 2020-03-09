package stacksandqueues;

public class Queue <E>{

    Node<E> frontSpot;
    Node<E> backSpot;

    public Queue(){
        this.frontSpot = null;
        this.backSpot = null;
    }

    public void enqueque(E value){

        Node<E> newValue = new Node<E>(value);

        if(frontSpot == null){
            this.frontSpot = newValue;
        } else {
            this.backSpot.next = newValue;
        }
        this.backSpot = newValue;
    }

    public E dequeque(){
        if(this.frontSpot == null){
            throw new IllegalArgumentException("The queue is empty!");
        } else {
            Node<E> newFront = frontSpot;
            frontSpot = frontSpot.next;
            return newFront.data;
        }
    }

    public E peek(){
        if(this.frontSpot == null){
            throw new IllegalArgumentException("The queue is empty!");
        } else {
            return frontSpot.data;
        }
    }

    public boolean isEmpty(){
        if(this.frontSpot == null){
            return true;
        }
        return false;
    }
}

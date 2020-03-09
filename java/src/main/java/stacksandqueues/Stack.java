package stacksandqueues;

public class Stack <E> {

    Node<E> top;

    public Stack(){
        this.top = null;
    }

    public void push(E newValue){
        Node<E> value = new Node<E>(newValue);
            value.next = this.top;
            this.top = value;
    }

    public E pop(){
        if(this.top == null){
            throw new IllegalArgumentException("The stack is empty");
        } else{
            Node<E> newTop = top;
            top = top.next;
            return newTop.data;
        }
    }

    public E peek(){
        if(this.top == null){
            throw new IllegalArgumentException("The stack is empty");
        } else {
            return top.data;
        }
    }

    public boolean isEmpty(){
        if(this.top == null){
            return true;
        } else{
            return false;
        }
    }
}

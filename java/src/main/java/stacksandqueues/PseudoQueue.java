package stacksandqueues;

public class PseudoQueue {

    Stack<Integer> stackOne = new Stack<>();
    Stack<Integer> stackTwo = new Stack<>();

    public PseudoQueue(Stack stackOne, Stack stackTwo) {
        this.stackOne = stackOne;
        this.stackTwo = stackTwo;
    }

    public void enqueue(int N){
        while(!stackTwo.isEmpty()){
            stackOne.push(stackTwo.pop());
        }
        stackOne.push(N);
    }

    public int dequeue(){
        while(!stackOne.isEmpty()){
            stackTwo.push(stackOne.pop());
        }
        return stackTwo.pop();
    }
}

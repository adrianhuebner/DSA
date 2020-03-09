package stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    Stack newStack = new Stack<>();
    @Before
    public void settingUp(){
        newStack.push(10);
        newStack.push(9);
        newStack.push(8);
        newStack.push(7);
        newStack.push(6);
        newStack.push(5);
        newStack.push(4);
        newStack.push(3);
        newStack.push(2);
        newStack.push(1);
    }

    @Test
    public void pushingToStack(){
        assertEquals(
                "The top of the stack should be 1",
                1,
                newStack.pop()
        );
    }

    @Test
    public void canPop(){
        assertEquals(
                "Number 1 should be popped off of the stack",
                1,
                newStack.pop()
        );
    }

    @Test
    public void canPeek(){
        assertEquals(
                "Should find the value of 1 as the top of the stack",
                1,
                newStack.peek()
        );
    }

    @Test
    public void nothingInStack(){
        Stack empty = new Stack<>();
        assertNull(empty.top);
    }

    @Test(expected = IllegalArgumentException.class)
    public void noTopToPop(){
        Stack empty = new Stack<>();
        assertEquals(
                "Should get back an error message",
                "The stack is empty",
                empty.pop()
        );
    }

    @Test
    public void listIsNotEmpty(){
        assertEquals(
                "The list is not empty so it should return a false",
                false,
                newStack.isEmpty()
        );
    }

    @Test
    public void listIsEmpty(){
        Stack testStack = new Stack<>();
        assertEquals(
                "The list is empty so it should return a true",
                true,
                testStack.isEmpty()
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void nothingToPeekAt(){
        Stack empty = new Stack<>();
        assertEquals(
                "Should get back an error message",
                "The stack is empty",
                empty.peek()
        );
    }
}

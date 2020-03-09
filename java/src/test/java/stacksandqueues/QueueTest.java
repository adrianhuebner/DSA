package stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    Queue newQueue = new Queue<>();

    @Before
    public void settingUp(){
        newQueue.enqueque(1);
        newQueue.enqueque(2);
        newQueue.enqueque(3);
    }

    @Test
    public void enqueueTheQueue(){
        assertEquals(
                "Number 1 should be returned as being in the front of the Queue",
                1,
                newQueue.peek()
        );
    }

    @Test
    public void dequeueTheQueue(){
        assertEquals(
                "Number 1 should be returned",
                1,
                newQueue.dequeque()
        );
    }

    @Test
    public void queueIsEmpty(){
        Queue emptyQueue = new Queue<>();
        assertNull(emptyQueue.frontSpot);
    }

    @Test
    public void successfulPeek(){
        assertEquals(
                "Number 1 is what should be peeked at",
                1,
                newQueue.peek()
        );
    }

    @Test
    public void queueHasThings(){
        assertEquals(
                "Should receive back false because the queue has things in it",
                false,
                newQueue.isEmpty()
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void noQueueToDequeue(){
        Queue emptyQueue = new Queue<>();
        assertEquals(
                "Error message should be received",
                "The queue is empty!",
                emptyQueue.peek()
        );
    }
}

package linkedlist;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class LinkedListTest{

    LinkedList newLink = new LinkedList();
    @Before
    public void settingUp(){
        newLink.insert(10);
        newLink.append(20);
        newLink.append(30);
    }

    @Test
    public void createNewLinkedList(){
        assertEquals(
                "The head of linked list should be 10",
                10,
                newLink.head.data
        );
    }


    @Test
    public void returnTrueIfExists(){
        assertEquals(
                "This should be true that the linked list includes 20",
                true,
                newLink.includes(20)
        );
    }

    @Test
    public void returnFalseIfNotThere(){
        assertEquals(
                "This should return false because the linked list doesn't include 40",
                false,
                newLink.includes(40)
        );
    }

    @Test
    public void convertsToString(){
        assertEquals(
                "The string should look like String Linked List: 30 20 10",
                "String Linked List:  10 20 30",
                newLink.toString()
        );
    }

    @Test
    public void canAddBeforeMiddle(){
        newLink.insertBefore(20,15);
        assertEquals(
                "15 should be added to the middle of the linked list",
                true,
                newLink.includes(15)
        );
    }

    @Test
    public void canAddBeforeLast(){
        newLink.insertBefore(30,25);
        assertEquals(
                "25 should be added to the linked list",
                true,
                newLink.includes(25)
        );
    }

    @Test
    public void canAddBeforeFront(){
        newLink.insertBefore(10, 5);
        assertEquals(
                "5 should be included on the linked list",
                true,
                newLink.includes(5)
        );
    }

    @Test
    public void canAddAfterMiddleNode(){
        newLink.insertAfter(20,25);
        assertEquals(
                "should be included on the linked list",
                true,
                newLink.includes(25)
        );
    }

    @Test
    public void canAddAtTheEnd(){
        newLink.insertAfter(30,35);
        assertEquals(
                "should be included on the linked list",
                true,
                newLink.includes(35)
        );
    }
}
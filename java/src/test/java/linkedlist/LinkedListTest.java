package linkedlist;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class LinkedTest{

    LinkedList newLink = new LinkedList();
    @Before
        public void settingUp(){
            newLink.insert(10);
            newLink.insert(20);
            newLink.insert(30);
        }

    @Test
    public void createNewLinkedList(){
        assertEquals(
                "The head of linked list should be 10",
                10,
                newList.head.data
        );
    }


    @Test
    public void returnTrueIfExists(){
        assertEquals(
                "This should be true that the linked list includs 20",
                true,
                newLink.contains(20)
        );
    }

    @Test
    public void returnFalseIfNotThere(){
        assertEquals(
                "This should return false because the linked list doesn't include 40",
                false,
                newLink.contains(40)
        );
    }
}
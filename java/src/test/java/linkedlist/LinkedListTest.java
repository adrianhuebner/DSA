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
                "The string should look like String Linked List: 10 20 30",
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
                "Should be included on the linked list",
                true,
                newLink.includes(25)
        );
    }

    @Test
    public void canAddAtTheEnd(){
        newLink.insertAfter(30,35);
        assertEquals(
                "Should be included on the linked list",
                true,
                newLink.includes(35)
        );
    }

    @Test
    public void kIsInTheMiddle(){
        assertEquals(
                "The number found at the 1st position should be 30",
                30,
                newLink.kthFromTheEnd(1)
        );
    }

    @Test
    public void kIsTheSameLength(){
        assertEquals(
                "The number should return as 10",
                10,
                newLink.kthFromTheEnd(3)
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void kIsLongerThanTest(){
        assertEquals(
                "You should receive the illegal argument message because the linked list is shorter than k",
                "This list isn't long enough",
                newLink.kthFromTheEnd(4)
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void kIsNegativeNumber(){
        assertEquals(
                "You should receive a illegal argument message because a negative number was used for k",
                "You can't use a negative number for k",
                newLink.kthFromTheEnd(-1)
        );
    }

    @Test
    public void kthFromEndWithOnlyOneNode(){
        LinkedList newList = new LinkedList();
        newList.insert(1);
        assertEquals(
                "You should get 1 back",
                1,
                newList.kthFromTheEnd(1)
        );
    }

    @Test
    public void mergeListsEvenLengths(){
        LinkedList listOne = new LinkedList();
        LinkedList listTwo = new LinkedList();
        listOne.insert(1);
        listOne.append(3);
        listOne.append(5);
        listOne.append(7);
        listTwo.insert(2);
        listTwo.append(4);
        listTwo.append(6);
        listTwo.append(8);

        LinkedList.mergeLists(listOne,listTwo);
        assertEquals(
                "Output should be: String Linked List:  1 2 3 4 5 6 7 8",
                "String Linked List:  1 2 3 4 5 6 7 8",
                listOne.toString()
        );
    }

    @Test
    public void mergeListsUnevenList(){
        LinkedList listOne = new LinkedList();
        LinkedList listTwo = new LinkedList();
        listOne.insert(1);
        listOne.append(3);
        listOne.append(5);
        listOne.append(7);
        listTwo.insert(2);
        listTwo.append(4);

        LinkedList.mergeLists(listOne, listTwo);
        assertEquals(
                "Output should be: String Linked List:  1 2 3 4 5 7",
                "String Linked List:  1 2 3 4 5 7",
                listOne.toString()
        );
    }
}
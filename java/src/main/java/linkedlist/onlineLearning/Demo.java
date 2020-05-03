package linkedlist.onlineLearning;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        // this will be using built-in LinkedList and methods unlike my LinkedList class that I write the methods
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        printList(placesToVisit);

        placesToVisit.add(1, "Alice Springs");
            // This has happened automatically, Alice Springs will be added after Sydney
        printList(placesToVisit);

        placesToVisit.remove(4);
            // This happens automatically again, so Perth will be removed from the linked list
        printList(placesToVisit);
    }
    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
            // Iterator is the same idea as doing a for loop
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
            // What this while loop is doing:
                // While an element that's in this linked list is pointing to something else, while that is true we are going to show the current record
        System.out.println("====================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                // equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if(comparison > 0){
                // new city should appear before this one
                // Brisbane -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                System.out.println(newCity + " has been added to your list of destinations to visit");
                return true;
            } else if(comparison < 0){
                // move on to the next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }
}

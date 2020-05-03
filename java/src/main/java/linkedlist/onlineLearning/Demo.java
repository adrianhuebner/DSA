package linkedlist.onlineLearning;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        // this will be using built-in LinkedList and methods unlike my LinkedList class that I write the methods
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);

        addInOrder(placesToVisit, "Alice Springs");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);

        visit(placesToVisit);
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
            // NOTE:
                // The first time that you create the list iterator, that's not actually yet pointing to the first record
                // The use of the .next() to go to the first record
                // This is just a set up
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

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No cities found in the itinerary");
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("Vacation is over");
                    quit = true;
                    break;
                case 1:
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    } else{
                        System.out.println("Reached the end of the list");
                    }
                    break;
                case 2:
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.previous());
                    } else{
                        System.out.println("We are at the start of the list");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions: \npress");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n"+
                "2 - go to previous city\n"+
                "3 - print menu options");
    }
}

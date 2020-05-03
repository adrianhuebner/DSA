package linkedlist.onlineLearning;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Olive", 1000.00);
        Customer anotherCustomer;
        anotherCustomer = customer;
            // in above line of code, under the cover Java is assigning the second Customer class to the first Customer class
                // in other words it just saved the memory address, it didn't create a second class
                // as a result of not only saving the memory address, when using that balance command what that actually did was it saved the value in its original location
                // customer is the first class and anotherCustomer is the second one that got created which is actually pointing to the first one
        anotherCustomer.setBalance(10000.00);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for(int i = 0; i < intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }
        intList.add(1, 2);

        for(int i = 0; i < intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }
        // when you do the above code to an arrayList, what you are doing is moving down every element down after the index that you chose
        // to do this when you have a lot of data that in that arrayList it is going to really slow down your program
        // when you have to remove an item from an arrayList all the items have to move up in their index, which can slow down computer processing time
    }
    // Additional Notes:
        // This shows how memory is used and allocated within Java
        // If Java doesn't let us use pointers, in other words we can't actually point to these objects directly, why are we taking about them?
            // It's important to understand all this before understanding what a linked list is and the advantages that it can give you over an array
}

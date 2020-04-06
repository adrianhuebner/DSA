package arrayList.modileProject;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printInstructions();
        while(!quit){
            System.out.println("Enter a number, what you would like to do with your contact list");

        }
    }

    public static void startPhone(){
        System.out.println("Phone is starting up!");
    }

    public static void printInstructions(){
        System.out.println("0 = Print instructions");
        System.out.println("1 = Print contact list");
        System.out.println("2 = Add a new contact to your list");
        System.out.println("3 = Modify one of your contacts");
        System.out.println("4 = Remove unwanted contact from your list");
        System.out.println("5 = Find a contact in your list");
        System.out.println("6 = Get the contact list");
        System.out.println("7 = Exit the application");
    }
}

package arrayList.modileProject;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        String contactName = null;
        int phoneNumber = 0;
        boolean quit = false;
        startPhone();
        printInstructions();
        while(!quit){
            System.out.println("Enter a number, what you would like to do with your contact list");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("All the contacts that you have are: ");
                    mobilePhone.getContactList();
                    break;
                case 1:
                    System.out.println("Please type the name and the phone number you would like to add\n" +
                                        "Phone number format example: " + 1234567890);
                    contactName = scanner.nextLine();

                case 5:
                    quit = false;
                    System.out.println("Thank you for using this phone application, have a great day!");
                    break;
            }
        }
    }

    public static void startPhone(){
        System.out.println("Phone is starting up!");
    }

    public static void printInstructions(){
        System.out.println("0 = Print contact list");
        System.out.println("1 = Add a new contact to your list");
        System.out.println("2 = Modify one of your contacts");
        System.out.println("3 = Remove unwanted contact from your list");
        System.out.println("4 = Find a contact in your list");
        System.out.println("5 = Exit the application");
    }
}

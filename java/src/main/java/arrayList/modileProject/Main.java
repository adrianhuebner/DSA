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
                    mobilePhone.printContacts();
                    break;
                case 1:
                    System.out.println("Please type the name and the phone number you would like to add\n" +
                                        "Phone number format example: " + 1234567890);
                    contactName = scanner.nextLine();
                    phoneNumber = isInteger(scanner);
                    addNewContactToList(new ContactList(contactName, phoneNumber));
                    break;
                case 2:
                    System.out.println("Enter the name of the contact that you would like to change:");
                    String originalContactName = scanner.nextLine();
                    System.out.println("Enter the new name for the contact and the phone number:");
                    contactName = scanner.nextLine();
                    phoneNumber = isInteger(scanner);
                    modifyAContact(originalContactName, new ContactList(contactName, phoneNumber));
                    break;
                case 3:
                    System.out.println("Enter the name of the contact that you would like to get rid of: ");
                    contactName = scanner.nextLine();
                    removeFromContactList(contactName);
                    break;
                case 4:
                    System.out.println("Enter the name of the contact that you want to look for: ");
                    contactName = scanner.nextLine();
                    lookupASingleContact(contactName);
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

    public static void addNewContactToList(ContactList contact){
        boolean added = mobilePhone.addNewContact(contact);
        if(added){
            System.out.println(contact.getContactName() + " was added to your list of contacts");
        } else {
            System.out.println("There was an error in adding " + contact.getContactName() + " to your list of contacts");
        }
    }

    public static void modifyAContact(String name, ContactList newContact){
        boolean modifiedContact = mobilePhone.updateContact(name, newContact);
        if(modifiedContact){
            System.out.println(name + " has been updated and changed to " + newContact.getContactName());
        } else {
            System.out.println("There was an error when trying to modify your contact");
        }
    }

    public static void removeFromContactList(String contactName){
        boolean deleteContact = mobilePhone.removeAContact(contactName);
        if(deleteContact){
            System.out.println(contactName + " has been deleted from your list of contacts");
        } else {
            System.out.println("There was an error in trying to delete " + contactName + " from your list.");
        }
    }

    public static void lookupASingleContact(String contactName){
        ContactList foundContact = mobilePhone.findAContact(contactName);
        if(foundContact.getContactName() != null){
            System.out.println("Found contact information for " + contactName);
            System.out.println(foundContact.toString());
        } else {
            System.out.println("No contact information was found for " + contactName);
        }
    }

    public static int isInteger(Scanner scanner){
        int phoneNumber = 0;
        boolean isTruth = true;
        while(isTruth){
            if(scanner.hasNextInt()){
                phoneNumber = scanner.nextInt();
                isTruth = false;
            } else{
                System.out.println("The phone number you entered was not an integer, please try again");
            }
            scanner.nextLine();
        }
        return phoneNumber;
    }
}

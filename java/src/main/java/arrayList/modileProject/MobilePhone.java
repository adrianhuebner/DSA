package arrayList.modileProject;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<ContactList> contactList;

    public boolean addNewContact(ContactList contact){
        String contactName = contact.getContactName();

        if(findContactIndex(contactName) >= 0){
            System.out.println(contactName + " already exists in your contact list");
            return false;
        } else {
            contactList.add(contact);
            System.out.println(contactName + " has been added to your contacts");
            return true;
        }
    }

    public boolean updateContact(String originalName, ContactList newContactInfo){
        int foundPosition = findContactIndex(originalName);
        if(foundPosition < 0){
            System.out.println(originalName + ", was not found in your contact list");
            return false;
        }
        this.contactList.set(foundPosition, newContactInfo);
        System.out.println(originalName + " was replaced with " + newContactInfo.getContactName());
        return true;
    }

    public boolean removeAContact(String contactName){
        int foundPosition = findContactIndex(contactName);
        if(foundPosition < 0){
            System.out.println(contactName + ", was not found in your contact list");
            return false;
        }
        this.contactList.remove(foundPosition);
        System.out.println(contactName + " was removed from your contact list.");
        return true;
    }

    public ArrayList<ContactList> getContactList(){
        return this.contactList;
    }

    public int findContactIndex(String contactName){
        int index = -1;
        for(ContactList contact : contactList){
            if (contactName.equalsIgnoreCase(contact.getContactName())) {
                index = contactList.indexOf(contact);
            }
        }
        return index;
    }

    public ContactList findAContact(String contactName){
        if(contains(contactName)){
            return contactList.get(findContactIndex(contactName));
        } else {
            return null;
        }
    }

    public boolean contains(String contactName){
        ContactList contact = null;
        for(ContactList contacts : contactList){
            if(contactName.equalsIgnoreCase(contact.getContactName())){
                contact = contacts;
            }
        }
        if(contact == null){
            return false;
        } else {
            return contactList.contains(contact);
        }
    }

    public void printContacts(){
        System.out.println("List of Contacts: ");
        contactList.forEach(contact -> System.out.println(contact));
    }
}

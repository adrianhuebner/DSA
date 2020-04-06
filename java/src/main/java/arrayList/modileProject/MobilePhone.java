package arrayList.modileProject;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<ContactList> contactList;

    public boolean addNewContact(ContactList contact){
        String contactName = contact.getContactName();

        if(findContact(contact) >= 0){
            System.out.println(contactName + " already exists in your contact list");
            return false;
        } else {
            contactList.add(contact);
            System.out.println(contactName + " has been added to your contacts");
            return true;
        }
    }

    public boolean updateContact(ContactList oldContactInfo, ContactList newContactInfo){
        int foundPosition = findContact(oldContactInfo);
        if(foundPosition < 0){
            System.out.println(oldContactInfo.getContactName() + ", was not found in your contact list");
            return false;
        }
        this.contactList.set(foundPosition, newContactInfo);
        System.out.println(oldContactInfo.getContactName() + " was replaced with " + newContactInfo.getContactName());
        return true;
    }

    public boolean removeAContact(ContactList contact){
        int foundPosition = findContact(contact);
        if(foundPosition < 0){
            System.out.println(contact.getContactName() + ", was not found in your contact list");
            return false;
        }
        this.contactList.remove(foundPosition);
        System.out.println(contact.getContactName() + " was removed from your contact list.");
        return true;
    }

    public ArrayList<ContactList> getContactList(){
        return this.contactList;
    }

    private int findContact(ContactList contact){
        return this.contactList.indexOf(contact);
    }

    private int findContact(String contactName){
        for(int i = 0; i < this.contactList.size(); i++){
            ContactList contact = this.contactList.get(i);
            if(contact.getContactName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact(ContactList contact){
        if(findContact(contact) >= 0){
            return contact.getContactName();
        }
        return null;
    }
}
